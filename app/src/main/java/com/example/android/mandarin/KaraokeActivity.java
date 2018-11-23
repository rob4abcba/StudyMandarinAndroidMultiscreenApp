package com.example.android.mandarin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class KaraokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Change the ArrayList of Strings called "words" into an ArrayList of Word objects
        ArrayList<Word> words = new ArrayList<Word>();
        // RL ArrayList<String> list = new ArrayList<String>();

        // words.add("yi");
        words.add(new Word("one","yī", R.drawable.number_one));
        words.add(new Word("two","èr", R.drawable.number_two));
        words.add(new Word("three","sān", R.drawable.number_three));
        words.add(new Word("four","si", R.drawable.number_one));
        words.add(new Word("five","wu", R.drawable.number_one));
        words.add(new Word("six","liu", R.drawable.number_one));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        // RL ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        // Same as above except data source is a list of Word objects.
        // Replace the Android team's generic simple_list_item_1.xml layout resource with our own
        // custom list_item layout resource.  Our list item layout contains two {@link TextView}, which
        // our adapter will set to a Mandarin word on top of the corresponding English word.
        // RL ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

        // Same as above except no need to use Android's ArrayAdapter with our list_item resource choice.
        // Instead create our own Adapter and call it WordAdapter.  It will always use our list_item layout
        // so no need to have that as a parameter anymore.
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        // Experiment with different types of views (GridView, etc.). Then change back to ListView.
        // RL GridView listView = (GridView) findViewById(R.id.list);
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        // RL listView.setAdapter(itemsAdapter);
        // Same as above except pass in the {@link WordAdapter} with the variable name adapter.
        listView.setAdapter(adapter);

    }
}
