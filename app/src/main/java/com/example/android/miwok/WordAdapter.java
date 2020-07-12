package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position,  @Nullable View convertView,  @NonNull ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word word = getItem(position);
        TextView englishTextView = view.findViewById(R.id.englishNumbersTextView);
        englishTextView.setText(word.getDefaultTranslation());
        TextView miwokTextView = view.findViewById(R.id.miwokNumberTextView);
        miwokTextView.setText(word.getMiwokTranslation());
        ImageView imageView = view.findViewById(R.id.itemImage);
        imageView.setImageResource(word.getResourceId());

        return view;

    }
}
