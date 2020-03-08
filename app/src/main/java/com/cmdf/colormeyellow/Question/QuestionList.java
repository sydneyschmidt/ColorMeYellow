package com.cmdf.colormeyellow.Question;

import java.util.ArrayList;

public class QuestionList {
    private static final String INTRO1 = "On a scale of 1-5 (1 being low, 5 being high), ";
    private static final String INTRO2 = "On a scale of 1-5 (1 being difficult, 5 being easy), ";
    private static final String INTRO3 = "On a scale of 1-5 (1 being bad, 5 being great), ";
    ArrayList<String> list;

    //Stores daily questions
    public QuestionList() {
        this.list = new ArrayList<>();
    }

    private void setQ1() {
        list.set(0, INTRO1 + "how motivated are you today?");
    }

    private void setQ2() {
        list.set(1, INTRO1 + "how overwhelmed are you feeling today?"); //TODO: remember to reverse
    }

    private void setQ3() {
        list.set(2, INTRO2 + "how easy was it for you to fall asleep last night?");
    }

    private void setQ4() {
        list.set(3, INTRO3 + "how would you rate the quality of your sleep?");
    }

    private void setQ5() {
        list.set(4, INTRO3 + "how are you feeling overall today?");
    }
}
