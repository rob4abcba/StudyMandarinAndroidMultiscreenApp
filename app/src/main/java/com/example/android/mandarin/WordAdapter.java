package com.example.android.mandarin;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Word} objects.
 * */
public class WordAdapter extends ArrayAdapter<Word> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;



    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of Word objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView simpcharTextView = (TextView) listItemView.findViewById(R.id.simpchar_text_view);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        simpcharTextView.setText(currentWord.getSimplifiedChineseChar());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView pinyinTextView = (TextView) listItemView.findViewById(R.id.pinyin_text_view);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        pinyinTextView.setText(currentWord.getPinyinTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        // Get the version number from the current Word object and
        // set this text on the number TextView
        englishTextView.setText(currentWord.getEnglishTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            // Get the image resource ID from the current Word object and
            // set the image to imageView
            imageView.setImageResource(currentWord.getImageResourceId());

            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            // Otherwise hide the ImageView
            imageView.setVisibility(View.GONE);
        }

        // Set theme color for the list_item.xml row
        View rowContainer = listItemView.findViewById(R.id.row_container);
        // Find color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        rowContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;







    }
}
