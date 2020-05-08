package com.bridgelabz;

import java.lang.reflect.Constructor;

public class MoodAnalyserFactory {

    public static Constructor getConstructor(String className, Class... parameter) throws MoodAnalysisException {
        try {
            Class<?> moodAnalyserClass = Class.forName(className);
            return moodAnalyserClass.getConstructor(parameter);
        } catch (ClassNotFoundException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS, "Class not found");
        } catch (NoSuchMethodException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD, "Method not found");
        }
    }

}