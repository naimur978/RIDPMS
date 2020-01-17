package com.naimur978.ridpms;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment4 extends Fragment {
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_fragment4,container,false);
        return rootView;
    }

    @Override
    public String toString() {
        String title="Profile";
        return title;
    }
}
