package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class EditTweetActivity extends Activity {
    private EditText messageText;
    private EditText dateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Tweet tweet = (Tweet) getIntent().getSerializableExtra("Test Tweet!");

        messageText = (EditText) findViewById(R.id.message);
        dateText = (EditText) findViewById(R.id.date);

        messageText.setText(tweet.getMessage());
        dateText.setText(tweet.getDate().toString());
    }
}
