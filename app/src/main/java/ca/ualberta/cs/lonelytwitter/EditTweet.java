package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
//import android.text.TextWatcher; --> Disabled unused import
import android.widget.TextView;

public class EditTweet extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        String tweetMessage = getIntent().getStringExtra("TWEET");
        TextView tweet = (TextView) findViewById(R.id.Tweet);
        tweet.setText(tweetMessage);
    }
}
