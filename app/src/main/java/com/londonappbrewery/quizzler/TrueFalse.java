package com.londonappbrewery.quizzler;

/**
 * Created by ppthr on 11/30/2017.
 */

public class TrueFalse
{
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse)
    {
        this.mQuestionID = questionResourceID;
        this.mAnswer = trueOrFalse;
    }

    public int getQuestionID()
    {
        return this.mQuestionID;
    }

    public void setQuestionID(int questionID)
    {
        this.mQuestionID = questionID;
    }

    public boolean isAnswer()
    {
        return this.mAnswer;
    }

    public void setAnswer(boolean answer)
    {
        this.mAnswer = answer;
    }
}