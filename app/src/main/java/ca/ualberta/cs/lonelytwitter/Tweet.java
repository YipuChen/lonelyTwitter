package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<Mood> moods;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public void MoodList(){
        moods = new ArrayList<Mood>();
    }

    public void addMood(Mood mood){
        this.moods.add(mood);
    }

    public abstract Boolean isImportant();
}