package com.example.android.miwok;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int color;

    public WordAdapter(Context context, ArrayList<Word> objects, int color) {
        super(context, 0, objects);
        this.color = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwokWord);
        miwokWord.setText(currentWord.getMiwokWord());
        TextView englishWord = (TextView) listItemView.findViewById(R.id.englishWord);
        englishWord.setText(currentWord.getEnglishWord());
        ImageView image = (ImageView) listItemView.findViewById(R.id.list_item_image);
        image.setImageResource(currentWord.getImageResourceId());
        listItemView.setBackgroundResource(R.color.tan_background);

        if (currentWord.getImageResourceId() == 0) image.setVisibility(View.GONE);
        View verticalLayout = listItemView.findViewById(R.id.verticalLayout);
        verticalLayout.setBackgroundResource(color);
        View audioIcon = listItemView.findViewById(R.id.audio_icon);
        audioIcon.setBackgroundResource(color);
        return listItemView;
    }


}
