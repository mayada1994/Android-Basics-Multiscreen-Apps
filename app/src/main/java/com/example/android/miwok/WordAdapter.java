package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<com.example.android.miwok.Word> {

    private int currColor;

    public WordAdapter(Activity context, ArrayList<com.example.android.miwok.Word> words, int color) {
        super(context, 0, words);
        currColor = color;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        com.example.android.miwok.Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokWord);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView engTextView = (TextView) listItemView.findViewById(R.id.engWord);

        engTextView.setText(currentWord.getDefaultTranslation());

        ImageView imgImageView = (ImageView) listItemView.findViewById(R.id.image_resource);

        if (currentWord.hasImage()) {
            imgImageView.setImageResource(currentWord.getImageResourceId());
            imgImageView.setVisibility(View.VISIBLE);
        } else {
            imgImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.layout_colored);
        int color = ContextCompat.getColor(getContext(), currColor);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
