package com.example.android.raidighitour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GovtPrimaryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GovtPrimaryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GovtPrimaryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GovtPrimaryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GovtPrimaryFragment newInstance(String param1, String param2) {
        GovtPrimaryFragment fragment = new GovtPrimaryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.list_view, container, false);

        final List<Word> school=new ArrayList<>();
        school.add(new Word(getString(R.string.giribalaPrimeryScholl),R.drawable.giribala_primery_school));
        school.add(new Word(getString(R.string.empty_descrption),R.drawable.endsign));

        ArrayAdapter<Word> aa= new WordAdapter(getActivity(),school);
        ListView listView=(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(aa);

        return rootView;
    }
}