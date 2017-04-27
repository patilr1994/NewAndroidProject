package com.example.rahul.recyclerviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahul.recyclerviewdemo.R;
import com.example.rahul.recyclerviewdemo.domain.Enquiry;

import java.util.List;

/**
 * Created by Rahul on 26-Apr-17
 */

public class EnquiryAdapter extends RecyclerView.Adapter<EnquiryAdapter.EnquiryViewHolder> {

    private Context context;
    private List<Enquiry> enquiries;

    public EnquiryAdapter(Context context,List<Enquiry> enquiries) {
        this.context = context;
        this.enquiries = enquiries;
    }

    @Override
    public EnquiryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.custom_car_enquiries,parent,false);
        return new EnquiryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EnquiryViewHolder holder, int position) {
        holder.txtStudName.setText(enquiries.get(position).getStudName());
        holder.txtCourseName.setText(enquiries.get(position).getCourceName());
    }

    @Override
    public int getItemCount() {
        return enquiries.size();
    }

    class EnquiryViewHolder extends RecyclerView.ViewHolder {
        private AppCompatTextView txtStudName,txtCourseName;
        public EnquiryViewHolder(View itemView) {
            super(itemView);
            txtStudName = (AppCompatTextView) itemView.findViewById(R.id.txtStudName);
            txtCourseName = (AppCompatTextView) itemView.findViewById(R.id.txtCourseName);
        }

    }
}
