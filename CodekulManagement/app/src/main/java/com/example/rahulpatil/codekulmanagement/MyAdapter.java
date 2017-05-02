package com.example.rahulpatil.codekulmanagement;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rahul Patil on 12-Apr-17
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Items> itemses = new ArrayList<>();
    private Context context;

    public MyAdapter(Context context,List<Items> itemses) {
        this.itemses = itemses;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Items items = itemses.get(position);
        holder.batch.setText(items.getBatch());
        holder.startdate.setText(items.getStartdate());
        holder.time.setText(items.getTime());

    }

    @Override
    public int getItemCount() {

        return itemses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView batch;
        public TextView startdate;
        public TextView time;


        public ViewHolder(View itemView) {
            super(itemView);

            batch = (TextView) itemView.findViewById(R.id.batch);
            startdate = (TextView) itemView.findViewById(R.id.startdate);
            time = (TextView) itemView.findViewById(R.id.time);

        }
    }


}
