package com.bridgelabz;

import java.util.Objects;

import static com.bridgelabz.MoodAnalysisException.ExceptionType.ENTERED_EMPTY;
import static com.bridgelabz.MoodAnalysisException.ExceptionType.ENTERED_NULL;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Mood Cannot be Empty or Null");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Mood Cannot be Empty or Null");
        }
    }

    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoodAnalyser that = (MoodAnalyser) o;
        return Objects.equals(message, that.message);
    }

}


