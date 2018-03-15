package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

// Made package private
interface Tweetable {
    // Removed the public modifier, since it is redundant
    String getMessage();

    Date getDate();

}
