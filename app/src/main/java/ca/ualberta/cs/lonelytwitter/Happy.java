package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Chady on 2018-01-18.
 */

public class Happy extends Mood {
    protected Date date;
    protected String mood;

    public Happy(String mood){
        super("Happy");
    }

    public Happy(String mood, Date date){
        super("Happy", date);
    }


    @Override
    public String getMood() {
        return mood + ">:)";
    }
}
