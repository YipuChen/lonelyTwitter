package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Yipu on 15/02/2018.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) throws IllegalArgumentException {

        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    public Boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public int getCount() {
        return tweets.size();
    }

    public ArrayList<Tweet> getTweets() {
//        Collections.sort(tweets, new Comparator<Tweet>() {
//            public int compare(Tweet tweet, Tweet t1) {
//                return tweet.getDate().compareTo(t1.getDate());
//            }
//        });
        Collections.reverse(tweets);
        return tweets;
    }
}

