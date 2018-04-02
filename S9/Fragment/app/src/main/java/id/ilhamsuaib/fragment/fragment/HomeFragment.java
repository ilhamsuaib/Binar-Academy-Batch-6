package id.ilhamsuaib.fragment.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import id.ilhamsuaib.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private Button clickMe;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String fragmentName) {
        Bundle args = new Bundle();
        //1. untuk menyimpan data 'nama fragment' ke dalam bundle
        args.putString("nama", fragmentName);
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        clickMe = view.findViewById(R.id.btn);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //2. untuk mengambil data dari bundle, yaitu nama fragment
        String namaFragment = getArguments().getString("nama");
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
