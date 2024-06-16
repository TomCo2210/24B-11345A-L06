package dev.tomco.a24b_11345a_l06.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textview.MaterialTextView;

import dev.tomco.a24b_11345a_l06.R;

public class MapFragment extends Fragment {

    private MaterialTextView map_LBL_title;

    public MapFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_map, container, false);

        findViews(v);

        return v;
    }

    private void findViews(View v) {
        map_LBL_title = v.findViewById(R.id.map_LBL_title);
    }

    public void zoom(double lat, double lon){
        map_LBL_title.setText(lat + "\n" + lon);
    }
}