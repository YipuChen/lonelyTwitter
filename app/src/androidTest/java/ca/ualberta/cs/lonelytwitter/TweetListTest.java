package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Yipu on 15/02/2018.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        Boolean thrown = Boolean.FALSE;

        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");

        try{
            tweets.add(tweet);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(tweets.hasTweet(tweet));
        assertFalse(thrown);

        try{
            tweets.add(tweet);
        } catch (IllegalArgumentException e){
            thrown = true;
        }

        assertTrue(thrown);
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");

        assertFalse(tweets.hasTweet(tweet));

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));

    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");

        tweets.add(tweet);

        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");
        Tweet tweet1 = new NormalTweet("adding a normal tweet");
        Tweet tweet2 = new NormalTweet("adding a normal tweet");
        Tweet tweet3 = new NormalTweet("adding a normal tweet");

        assertEquals(tweets.getCount(), 0);

        tweets.add(tweet);
        assertEquals(tweets.getCount(), 1);
        tweets.add(tweet1);
        assertEquals(tweets.getCount(), 2);
        tweets.add(tweet2);
        assertEquals(tweets.getCount(), 3);
        tweets.add(tweet3);
        assertEquals(tweets.getCount(), 4);
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal tweet");
        Tweet tweet1 = new NormalTweet("adding a normal tweet1");
        Tweet tweet2 = new NormalTweet("adding a normal tweet2");
        Tweet tweet3 = new NormalTweet("adding a normal tweet3");


        tweets.add(tweet);
        assertEquals(tweet,tweets.getTweets().get(0));
        tweets.add(tweet1);
        assertEquals(tweet1,tweets.getTweets().get(0));
        tweets.add(tweet2);
        assertEquals(tweet2,tweets.getTweets().get(0));
        tweets.add(tweet3);
        assertEquals(tweet3,tweets.getTweets().get(0));

    }
}
