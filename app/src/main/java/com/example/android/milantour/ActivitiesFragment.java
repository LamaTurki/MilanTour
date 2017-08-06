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
public class ActivitiesFragment extends Fragment {
    public final static String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    public static ActivitiesFragment newInstance(int page) {

        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        ActivitiesFragment fragment = new ActivitiesFragment();
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
        attractionList.add(new Attraction(getString(R.string.sempione_park_name), getString(R.string.sempione_park_phone),
                getString(R.string.sempione_park_address)));
        attractionList.add(new Attraction(getString(R.string.fun_fun_name), getString(R.string.fun_fun_phone),
                getString(R.string.fun_fun_address)));
        attractionList.add(new Attraction(getString(R.string.lake_como_name), getString(R.string.lake_como_phone),
                getString(R.string.lake_como_address)));
        attractionList.add(new Attraction(getString(R.string.duomo_name), getString(R.string.duomo_phone),
                getString(R.string.duomo_address)));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractionList);
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);
        return rootView;
    }
}
