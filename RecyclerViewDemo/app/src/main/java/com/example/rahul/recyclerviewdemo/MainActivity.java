package com.example.rahul.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rahul.recyclerviewdemo.adapter.EnquiryAdapter;
import com.example.rahul.recyclerviewdemo.domain.Enquiry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        EnquiryAdapter enquiryAdapter = new EnquiryAdapter(this,getEnquiryList());
        getRecyclerView().setAdapter(enquiryAdapter);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));

    }

    private RecyclerView getRecyclerView(){
        return (RecyclerView) findViewById(R.id.recyclerViewEnquiries);

    }
    private List<Enquiry> getEnquiryList()
    {
        List<Enquiry> enquiries = new ArrayList<>();
        String [] names = getResources().getStringArray(R.array.name);
        String [] course = getResources().getStringArray(R.array.cname);
for (int i =0;i<names.length;i++){
    Enquiry enquiry = new Enquiry();
    enquiry.setStudName(names[i]);
    enquiry.setCourseName(course[i]);
    enquiries.add(enquiry);
}

        /*for (String name : names){
            Enquiry enquiry = new Enquiry();
            enquiry.setStudName(name);
            enquiries.add(enquiry);
        }
*/


        return enquiries;
    }
}
