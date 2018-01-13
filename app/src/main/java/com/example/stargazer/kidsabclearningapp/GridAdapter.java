package com.example.stargazer.kidsabclearningapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Stargazer on 1/10/2018.
 */

public class GridAdapter extends BaseAdapter {

    private String[] letters;
    private Context context;
    private LayoutInflater inflater;

    public GridAdapter(Context context, String[] letters) {

        this.context = context;
        this.letters = letters;
    }

    @Override
    public int getCount() {
        return letters.length;
    }

    @Override
    public Object getItem(int i) {
        return letters[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View gridView = view;

        if(view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_layout,null);
        }

        TextView letter = gridView.findViewById(R.id.tvLetters);
        letter.setText(letters[i]);
        return null;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
