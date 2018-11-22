package com.example.android.mandarin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class KaraokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karaoke);

        //Create an array of words
        ArrayList<String> words = new ArrayList<String>();

        words.add("chang");
        words.add("ge");
        words.add("artist");
        words.add("song");


        // Find the root view so we can add child views to it
        LinearLayout rootKaraokeView = (LinearLayout) findViewById(R.id.rootKaraokeView);

        // Create a variable to keep track of the current index position
        int index = 0;

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        while (index < words.size()) {

            Log.v("KaraokeActivity", "Word at Index: " + index + " is " + words.get(index));

            // Create a new TextView
            TextView wordView = new TextView(this);

            // Set the text to be word at the current index
            wordView.setText(words.get(index));

            // Add this TextView as another child to the root view of this layout
            rootKaraokeView.addView(wordView);

            // Increment the index variable by 1
            index++;
        }







    }
}
