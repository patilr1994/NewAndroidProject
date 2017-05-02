package com.example.rahulpatil.codekulmanagement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rahul on 02-May-17
 */

public class CourseFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
        @Nullable ViewGroup container,
        @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_regular,container,false);
        initRecyclerView(view);
        return view;
    }

    private void initRecyclerView(View view) {
        Log.i("@codekul","List "+getItemsList());
        MyAdapter enquiryAdapter = new MyAdapter(getContext(),getItemsList());
        getRecyclerView(view).setAdapter(enquiryAdapter);
        getRecyclerView(view).setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private RecyclerView getRecyclerView(View view){
        return (RecyclerView) view.findViewById(R.id.recyclerView);

    }
    private List<Items> getItemsList(){
        List<Items> itemsList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {

            Items items = new Items("Batch:",
                    "StartDate:",
                    "Time:");

            itemsList.add(items);
        }
        return itemsList;
    }
}
