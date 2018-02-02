/*  ImpotantTweet
 *
 *  Version 1.0
 *
 *  Feb 01, 2018
 *
 * Copyright (c) 2018 Team 24, CMPUT301. University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of Code of Student Behavior
 * at University of Alberta.
 * You can find a copy of the lincense in this project. Otherwise, please contact yipu1@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an important tweet
 *
 * @author Yipu
 *
 * @version 1.0
 *
 * @see Tweet
 * @see NormalTweet
 */

public class ImportantTweet extends Tweet {

    /**
     * Constructs an important tweet instance using the given message
     *
     * @param message the message of the tweet
     */

    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an important tweet instance using the given message
     *
     * @param message the message of the tweet
     * @param date the date of the tweet
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
