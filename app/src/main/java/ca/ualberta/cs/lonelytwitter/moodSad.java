package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Yipu on 18/01/2018.
 */

public class moodSad extends Mood {

    public moodSad(String mood){
        super(mood);
    }

    public moodSad(String mood, Date date){
        super(mood, date);
    }

    @Override
    public String currentMood() {
        return "Sad";
    }
}
