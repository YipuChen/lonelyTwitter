package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Yipu on 18/01/2018.
 */

public class moodHappy extends Mood {

    public moodHappy(String mood){
        super(mood);
    }

    public moodHappy(String mood, Date date){
        super(mood, date);
    }

    @Override
    public String currentMood() {
        return "Happy";
    }

}
