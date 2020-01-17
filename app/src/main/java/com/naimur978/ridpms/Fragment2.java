package com.naimur978.ridpms;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Fragment2 extends Fragment {
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_fragment2,container,false);
        return rootView;
    }



    @Override
    public String toString() {
        String title="User's LeaderBoard";
        return title;
    }
}
