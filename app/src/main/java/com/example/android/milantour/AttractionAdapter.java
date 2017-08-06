package com.example.android.milantour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lama on 8/4/2017 AD.
 */

public class AttractionAdapter extends BaseAdapter {
    Context context;
    ArrayList<Attraction> attractionsList = new ArrayList<Attraction>();

    public AttractionAdapter(Context context, ArrayList<Attraction> attractionsList) {
        this.context = context;
        this.attractionsList = attractionsList;
    }

    @Override
    public int getCount() {
        return attractionsList.size();
    }

    @Override
    public Attraction getItem(int position) {
        return attractionsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null)
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        final Attraction currentAttraction = getItem(position);

        TextView nameView = (TextView) view.findViewById(R.id.name);
        nameView.setText(currentAttraction.getmName());

        TextView phoneView = (TextView) view.findViewById(R.id.phone);
        phoneView.setText(currentAttraction.getmPhoneNumber());
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        if (currentAttraction.hasImage()) {

            imageView.setImageResource(currentAttraction.getmImageId());
            imageView.setVisibility(View.VISIBLE);
        } else
            imageView.setVisibility(View.GONE);

        ImageView locationIcon = (ImageView) view.findViewById(R.id.loc_icon);

        locationIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmUri = Uri.parse("geo:0.0?q=" + currentAttraction.getmAddress());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                context.startActivity(mapIntent);
            }
        });


        return view;
    }
}
