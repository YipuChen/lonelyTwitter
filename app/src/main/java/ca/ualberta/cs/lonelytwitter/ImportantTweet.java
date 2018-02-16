package ca.ualberta.cs.lonelytwitter;

/**
 * Created by romansky on 1/14/16.
 */
public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet(String message) {
        super(message);
    }

    @Override
    public boolean isImportant() {
        return true;
    }

    public String getMessage() {
        return "IMPORTANT!! " + this.message;
    }


    public int compareTo(Tweet tweet) {
        return getDate().compareTo(tweet.getDate());
    }
}
