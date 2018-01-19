package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Chady on 2018-01-18.
 */

public class Mad extends Mood {
    protected Date date;
    protected String mood;

    public Mad(String mood){
        super("Mad");
    }

    public Mad(String mood, Date date){
        super("Mad", date);
    }

    @Override
    public String getMood() {
        return mood + ">:(";
    }
}
