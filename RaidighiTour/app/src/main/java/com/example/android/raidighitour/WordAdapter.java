package com.example.android.raidighitour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, List<Word> object){

        super(context,0,object);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.visiting_place_list_item, parent, false);
        }

        Word currentWord=getItem(position);

        TextView description =(TextView)listItemView.findViewById(R.id.text_for_visiting_place);
        description.setText(currentWord.getmImagedescription());

        ImageView image =(ImageView)listItemView.findViewById(R.id.images_for_visiting_place);

        image.setImageResource(currentWord.getmImageResourcesId());
        image.setVisibility(View.VISIBLE);


        return listItemView;
    }
}
