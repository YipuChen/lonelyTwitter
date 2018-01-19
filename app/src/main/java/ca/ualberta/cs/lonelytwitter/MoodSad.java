package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Yipu on 18/01/2018.
 */

public class MoodSad extends Mood {

    public MoodSad(String mood){
        super(mood);
    }

    public MoodSad(String mood, Date date){
        super(mood, date);
    }

    @Override
    public String currentMood() {
        return "Sad";
    }
}
