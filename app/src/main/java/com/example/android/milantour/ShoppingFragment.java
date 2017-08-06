package com.example.android.milantour;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {

    public final static String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public ShoppingFragment() {
        // Required empty public constructor
    }

    public static ShoppingFragment newInstance(int page) {

        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        ShoppingFragment fragment = new ShoppingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        ArrayList<Attraction> attractionList = new ArrayList<Attraction>();
        attractionList.add(new Attraction(getString(R.string.serravalle_outlet_name), getString(R.string.serravalle_outlet_phone),
                getString(R.string.serravalle_outlet_address), R.drawable.shopping_serravalle_outlet));
        attractionList.add(new Attraction(getString(R.string.foxtown_outlet_name), getString(R.string.foxtown_outlet_phone),
                getString(R.string.foxtown_outlet_address), R.drawable.shopping_foxtown_outlet));
        attractionList.add(new Attraction(getString(R.string.vittorio_emanuele_name), getString(R.string.vittorio_emanuele_phone),
                getString(R.string.vittorio_emanuele_address), R.drawable.shopping_galleria_vittorio_emanuele_ii));
        attractionList.add(new Attraction(getString(R.string.piazza_portello_name), getString(R.string.piazza_portello_phone),
                getString(R.string.piazza_portello_address), R.drawable.shopping_piazza_portello));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractionList);
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);

        return rootView;
    }
}
