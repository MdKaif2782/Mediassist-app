package inc.typhon.mediassist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.security.auth.Subject;

public class QuestionList {
    private List<Question> GK;
    private Map<String,List<Question>> Botany;
    private Map<String,List<Question>> Zoology;
    private Map<String,List<Question>>  Physics;
    private Map<String,List<Question>> Chemistry;
    private Map<String,List<Question>> Maths;

    public QuestionList() {
    }

    public List<Question> getGK() {
        return GK;
    }

    public void setGK(List<Question> GK) {
        this.GK = GK;
    }

    public Map<String, List<Question>> getBotany() {
        return Botany;
    }

    public void setBotany(Map<String, List<Question>> botany) {
        Botany = botany;
    }

    public Map<String, List<Question>> getZoology() {
        return Zoology;
    }

    public void setZoology(Map<String, List<Question>> zoology) {
        Zoology = zoology;
    }

    public Map<String, List<Question>> getPhysics() {
        return Physics;
    }

    public void setPhysics(Map<String, List<Question>> physics) {
        Physics = physics;
    }

    public Map<String, List<Question>> getChemistry() {
        return Chemistry;
    }

    public void setChemistry(Map<String, List<Question>> chemistry) {
        Chemistry = chemistry;
    }

    public Map<String, List<Question>> getMaths() {
        return Maths;
    }

    public void setMaths(Map<String, List<Question>> maths) {
        Maths = maths;
    }

    public void addQuestion(String subject, String chapter, Question question){
        switch (subject){
            case "GK":
                GK.add(question);
                break;
            case "Botany":
                Botany.get(chapter).add(question);
                break;
            case "Zoology":
                Zoology.get(chapter).add(question);
                break;
            case "Physics":
                Physics.get(chapter).add(question);
                break;
            case "Chemistry":
                Chemistry.get(chapter).add(question);
                break;
            case "Maths":
                Maths.get(chapter).add(question);
                break;
        }
    }
    public void addQuestionList(String subject, String chapter, List<Question> questionList){
        switch (subject){
            case "GK":
                GK.addAll(questionList);
                break;
            case "Botany":
                Botany.get(chapter).addAll(questionList);
                break;
            case "Zoology":
                Zoology.get(chapter).addAll(questionList);
                break;
            case "Physics":
                Physics.get(chapter).addAll(questionList);
                break;
            case "Chemistry":
                Chemistry.get(chapter).addAll(questionList);
                break;
            case "Maths":
                Maths.get(chapter).addAll(questionList);
                break;
        }
    }
    public List<Question> getQuestionList(String subject, String chapter){
        List<Question> questionList = null;
        switch (subject){
            case "GK":
                questionList = GK;
                break;
            case "Botany":
                questionList = Botany.get(chapter);
                break;
            case "Zoology":
                questionList = Zoology.get(chapter);
                break;
            case "Physics":
                questionList = Physics.get(chapter);
                break;
            case "Chemistry":
                questionList = Chemistry.get(chapter);
                break;
            case "Maths":
                questionList = Maths.get(chapter);
                break;
        }
        return questionList;
    }

    public List<Question> getRandomQuestionList(String subject, String chapter, int count){
        List<Question> questionList = null;
        switch (subject){
            case "GK":
                questionList = GK;
                break;
            case "Botany":
                questionList = Botany.get(chapter);
                break;
            case "Zoology":
                questionList = Zoology.get(chapter);
                break;
            case "Physics":
                questionList = Physics.get(chapter);
                break;
            case "Chemistry":
                questionList = Chemistry.get(chapter);
                break;
            case "Maths":
                questionList = Maths.get(chapter);
                break;
        }
        List<Question> randomQuestionList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int randomIndex = (int) (Math.random() * questionList.size());
            randomQuestionList.add(questionList.get(randomIndex));
        }
        return randomQuestionList;
    }

    public List<Question> getRandomQuestionList(String subject,  int count){
        List<Question> questionList = null;
        switch (subject){
            case "GK":
                questionList = GK;
                break;
            case "Botany":
                for (Map.Entry<String, List<Question>> entry : Botany.entrySet()) {
                    questionList=entry.getValue();
                }
                break;
            case "Zoology":
                for (Map.Entry<String, List<Question>> entry : Zoology.entrySet()) {
                    questionList=entry.getValue();
                }
                break;
            case "Physics":
                for (Map.Entry<String, List<Question>> entry : Physics.entrySet()) {
                    questionList=entry.getValue();
                }
                break;
            case "Chemistry":
                for (Map.Entry<String, List<Question>> entry : Chemistry.entrySet()) {
                    questionList=entry.getValue();
                }
                break;
            case "Maths":
                for (Map.Entry<String, List<Question>> entry : Maths.entrySet()) {
                    questionList=entry.getValue();
                }
                break;
        }
        List<Question> randomQuestionList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int randomIndex = (int) (Math.random() * questionList.size());
            randomQuestionList.add(questionList.get(randomIndex));
        }
        return randomQuestionList;
    }

    public List<Question> getAllQuestions(){
        List<Question> allQuestions = new ArrayList<>();
        allQuestions.addAll(GK);
        for (Map.Entry<String, List<Question>> entry : Botany.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        for (Map.Entry<String, List<Question>> entry : Zoology.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        for (Map.Entry<String, List<Question>> entry : Physics.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        for (Map.Entry<String, List<Question>> entry : Chemistry.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        for (Map.Entry<String, List<Question>> entry : Maths.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        return allQuestions;
    }

    public List<Question> getRandomQuestionList(int count){
        List<Question> allQuestions = new ArrayList<>();
        allQuestions.addAll(GK);
        for (Map.Entry<String, List<Question>> entry : Botany.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        for (Map.Entry<String, List<Question>> entry : Zoology.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        for (Map.Entry<String, List<Question>> entry : Physics.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        for (Map.Entry<String, List<Question>> entry : Chemistry.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        for (Map.Entry<String, List<Question>> entry : Maths.entrySet()) {
            allQuestions.addAll(entry.getValue());
        }
        List<Question> randomQuestionList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int randomIndex = (int) (Math.random() * allQuestions.size());
            randomQuestionList.add(allQuestions.get(randomIndex));
        }
        return randomQuestionList;
    }



}
