package com.example.tanveer.myapplication;



public class QuestionLibrary {

    private String mQuestions[] = {
            "which part of the plant hold it in the soil?",
            "this part of the palnt absorbs the energy",
            "this part of the plant attaracts the bees",
            "the  _____hols the plant upright"
    };

    private String mChoices [] [] = {
            {"roots","stem","flower","abc"},
            {"fruit","leaves","seeds","abc"},
            {"bark","flower","roots","abc"},
            {"flower","leaves","stem","abc"}
    };

    private String mCorrectanswers[] = {"roots","leaves","flower"};



    public String getQuestion(int a){
        String question =mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {

        String choice0 = mChoices[a] [0];
        return choice0;
    }

    public String getChoice2(int a) {

        String choice1 = mChoices[a] [1];
        return choice1;
    }

    public String getChoice3(int a) {

        String choice2 = mChoices[a] [2];
        return choice2;
    }

    public String getChoice4(int a) {

        String choice3 = mChoices[a] [3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectanswers [a];
        return answer;
    }

}
