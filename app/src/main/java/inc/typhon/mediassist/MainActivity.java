package inc.typhon.mediassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import inc.typhon.mediassist.Adapter.QuestionListAdapter;

public class MainActivity extends AppCompatActivity {
    private List<Question> questions;
    private ListView listView;
    private FirebaseFirestore db;
    private QuestionList questionList;
    private QuestionListAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        db = FirebaseFirestore.getInstance();

         db.collection("QuestionLists")
                .document("QuestionList").get().addOnCompleteListener((snapshotTask)->{
                    if (snapshotTask.isSuccessful()){
                        questionList = snapshotTask.getResult().toObject(QuestionList.class);
                        List<Question> questions = null;
                        if (questionList != null) {
                            questions = questionList.getRandomQuestionList("Botany", 30);
                            listView = findViewById(R.id.list_view);
                            adapter = new QuestionListAdapter(this,questions);
                            listView.setAdapter(adapter);
                        }
                    } else {
                        Log.e("UWU", "Error getting documents.", snapshotTask.getException());
                    }});
        // the listView has multiple items,
        // each item has a CardView
        // each CardView has a constraintLayout
        // each constraintLayout has 4 cardViews
        // now we need to set onClickListener to each cardView

    }
    public void onClickOption(View view){
       // get the parent of the view
        // get the position of the parent
        // get the question from the list
        ViewGroup parent = (ViewGroup) view.getParent();
        ViewGroup parent2 = (ViewGroup) parent.getParent();
        int position = listView.getPositionForView(parent2);
        Question question = questions.get(position);
        // get the child text of the view
        // get the answer from the question

    }

}