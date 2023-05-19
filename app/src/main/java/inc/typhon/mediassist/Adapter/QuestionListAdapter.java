package inc.typhon.mediassist.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import org.w3c.dom.Text;

import java.util.List;

import inc.typhon.mediassist.Question;
import inc.typhon.mediassist.R;

public class QuestionListAdapter extends ArrayAdapter<Question> {
    private List<Question> questionList;
    private Context context;
    private int points = 0;


    public QuestionListAdapter(@NonNull Context context, @NonNull List<Question> objects) {
        super(context, R.layout.quiz_item_1, objects);
        this.questionList= objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView =  LayoutInflater.from(context).inflate(R.layout.quiz_item_1,parent,false);
        CardView opt1 = convertView.findViewById(R.id.quiz_option1_card);
        CardView opt2 = convertView.findViewById(R.id.quiz_option2_card);
        CardView opt3 = convertView.findViewById(R.id.quiz_option3_card);
        CardView opt4 = convertView.findViewById(R.id.quiz_option4_card);
        TextView question = convertView.findViewById(R.id.quiz_question);
        TextView option1 = convertView.findViewById(R.id.quiz_option1_text);
        TextView option2 = convertView.findViewById(R.id.quiz_option2_text);
        TextView option3 = convertView.findViewById(R.id.quiz_option3_text);
        TextView option4 = convertView.findViewById(R.id.quiz_option4_text);
        TextView question_no = convertView.findViewById(R.id.quiz_question_no_text);
        question.setText(questionList.get(position).getQuestion());
        option1.setText("a. "+questionList.get(position).getOption1());
        option2.setText("b. "+questionList.get(position).getOption2());
        option3.setText("c. "+questionList.get(position).getOption3());
        option4.setText("d. "+questionList.get(position).getOption4());
        question_no.setText(String.valueOf(position+1));


        return convertView;
    }

}
