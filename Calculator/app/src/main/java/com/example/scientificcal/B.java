package com.example.scientificcal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class B extends Fragment {

    ListView listView;

    public B(){

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_b,container,false);

        listView = view.findViewById(R.id.listView);

        ListAdapter listAdapter = new ListAdapter();
        for(int i=0; i<10; i++) {
            listAdapter.addItem("1+1 = 2");
            listAdapter.addItem("1+2 = 3");
        }

        listView.setAdapter(listAdapter);

        return view;
    }
}
