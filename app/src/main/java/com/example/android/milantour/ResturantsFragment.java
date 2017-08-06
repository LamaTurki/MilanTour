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
public class ResturantsFragment extends Fragment {
    public final static String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public ResturantsFragment() {
        // Required empty public constructor
    }

    public static ResturantsFragment newInstance(int page) {

        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        ResturantsFragment fragment = new ResturantsFragment();
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
        attractionList.add(new Attraction(getString(R.string.un_posto_a_milano_name), getString(R.string.un_posto_a_milano_phone),
                getString(R.string.un_posto_a_milano_address), R.drawable.resturant_un_posto_a_milano));
        attractionList.add(new Attraction(getString(R.string.ii_ristorante_name), getString(R.string.ii_ristorante_phone),
                getString(R.string.ii_ristorante_address), R.drawable.resturant_ii_ristorante));
        attractionList.add(new Attraction(getString(R.string.salsamenteria_di_parma_name), getString(R.string.salsamenteria_di_parma_phone),
                getString(R.string.salsamenteria_di_parma_address), R.drawable.resturant_salsamenteria_di_parma));
        attractionList.add(new Attraction(getString(R.string.al_pont_de_ferr_name), getString(R.string.al_pont_de_ferr_phone),
                getString(R.string.al_pont_de_ferr_address), R.drawable.resturant_al_pont_de_ferr));
        attractionList.add(new Attraction(getString(R.string.trussardi_alla_scala_name), getString(R.string.trussardi_alla_scala_phone),
                getString(R.string.trussardi_alla_scala_address), R.drawable.resturant_trussardi_alla_scala));
        attractionList.add(new Attraction(getString(R.string.zaini_name), getString(R.string.zaini_phone),
                getString(R.string.zaini_address), R.drawable.resturant_zaini));
        attractionList.add(new Attraction(getString(R.string.pasticceria_cova_name), getString(R.string.pasticceria_cova_phone),
                getString(R.string.pasticceria_cova_address), R.drawable.resturant_pasticceria_cova));
        attractionList.add(new Attraction(getString(R.string.gelato_giusto_name), getString(R.string.gelato_giusto_phone),
                getString(R.string.gelato_giusto_address), R.drawable.resturant_gelato_giusto));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractionList);
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);

        return rootView;
    }

}
