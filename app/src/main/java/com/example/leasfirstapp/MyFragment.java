package com.example.leasfirstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Fragment;

@SuppressLint("ValidFragment")
public class MyFragment extends Fragment {

    private int image_id;
    public MyFragment(int image_id) {
        this.image_id = image_id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content, container, false);
        ImageView image = (ImageView)view.findViewById(R.id.image_content);
        image.setImageResource(image_id);
        return view;
    }
}
