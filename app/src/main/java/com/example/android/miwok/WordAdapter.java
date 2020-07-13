package com.example.android.miwok;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    int listColor;

    public WordAdapter(@NonNull Context context, int resource, @NonNull List objects,int listColor) {
        super(context, resource, objects);
        this.listColor = listColor;
    }

    @NonNull
    @Override
    public View getView(int position,  @Nullable View convertView,  @NonNull ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word word = getItem(position);
        LinearLayout listLinearLayout =view.findViewById(R.id.listLinearLayout);
        listLinearLayout.setBackgroundResource(listColor);
        Log.i("debug", String.valueOf(listColor));
        Log.i("original", String.valueOf(R.color.category_numbers));
        TextView englishTextView = view.findViewById(R.id.englishNumbersTextView);
        englishTextView.setText(word.getDefaultTranslation());
        TextView miwokTextView = view.findViewById(R.id.miwokNumberTextView);
        miwokTextView.setText(word.getMiwokTranslation());
        ImageView imageView = view.findViewById(R.id.itemImage);
        if(word.isImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(word.getResourceId());
        }
        else
            imageView.setVisibility(View.GONE);
        return view;

    }
}
