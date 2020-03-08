package com.cmdf.colormeyellow;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cmdf.colormeyellow.ColorSquare.Color;
import com.cmdf.colormeyellow.ColorSquare.ColorSquare;

public class MapFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_map, container, false);
    }

    @Override
    public void onCreate(Bundle content) {

        super.onCreate(content);
        ColorSquare cs = ((MainActivity)getActivity()).getColorSquare();
        //Log.d(cs.color.toString());

    }
}
