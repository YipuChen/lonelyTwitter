package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Yipu on 18/01/2018.
 */

public class MoodHappy extends Mood {

    public MoodHappy(String mood){
        super(mood);
    }

    public MoodHappy(String mood, Date date){
        super(mood, date);
    }

    @Override
    public String currentMood() {
        return "Happy";
    }

}
