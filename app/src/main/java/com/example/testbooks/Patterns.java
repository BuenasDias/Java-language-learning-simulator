package com.example.testbooks;

public class Patterns {
    String questionPattern;

    public Patterns(String questionPattern) {
        this.questionPattern = questionPattern;
    }

    public String getQuestionPattern() {
        return questionPattern;
    }

    public int[] getGetQuestionPattern() {
        return getQuestionPattern;
    }

    int[] getQuestionPattern = {R.string.pattern_adapter,
            R.string.pattern_factory,
            R.string.pattern_abstract_factory,
            R.string.pattern_observer,
            R.string.pattern_singleton};
}
