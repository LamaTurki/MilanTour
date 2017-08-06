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
public class MuseumsFragment extends Fragment {
    public final static String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public MuseumsFragment() {
        // Required empty public constructor
    }

    public static MuseumsFragment newInstance(int page) {

        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        MuseumsFragment fragment = new MuseumsFragment();
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
        attractionList.add(new Attraction(getString(R.string.museo_del_novecento_name), getString(R.string.museo_del_novecento_phone),
                getString(R.string.museo_del_novecento_address), R.drawable.museum_museo_del_novecento));
        attractionList.add(new Attraction(getString(R.string.pinacoteca_di_brera_name), getString(R.string.pinacoteca_di_brera_phone),
                getString(R.string.pinacoteca_di_brera_address), R.drawable.museum_pinacoteca_di_brera));
        attractionList.add(new Attraction(getString(R.string.castello_sforzesco_name), getString(R.string.castello_sforzesco_phone),
                getString(R.string.castello_sforzesco_address), R.drawable.museum_castello_sforzesco));
        attractionList.add(new Attraction(getString(R.string.la_triennale_name), getString(R.string.la_triennale_phone),
                getString(R.string.la_triennale_address), R.drawable.museum_la_triennale_di_milano));
        attractionList.add(new Attraction(getString(R.string.villa_necchi_campiglio_name), getString(R.string.villa_necchi_campiglio_phone),
                getString(R.string.villa_necchi_campiglio_address), R.drawable.museum_villa_vecchi_campiglio));
        attractionList.add(new Attraction(getString(R.string.san_siro_name), getString(R.string.san_siro_phone),
                getString(R.string.san_siro_address), R.drawable.museum_stadio_giuseppe_meazza_));
        attractionList.add(new Attraction(getString(R.string.pinacoteca_ambrosiana_name), getString(R.string.pinacoteca_ambrosiana_phone),
                getString(R.string.pinacoteca_ambrosiana_address), R.drawable.museum_pinacoteca_ambrosiana));
        attractionList.add(new Attraction(getString(R.string.museo_della_scienza_name), getString(R.string.museo_della_scienza_phone),
                getString(R.string.museo_della_scienza_address), R.drawable.museum_museo_della_scienza));
        attractionList.add(new Attraction(getString(R.string.ii_cenacolo_name), getString(R.string.ii_cenacolo_phone),
                getString(R.string.ii_cenacolo_address), R.drawable.museum_ii_cenacolo));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractionList);
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);

        return rootView;
    }

}
