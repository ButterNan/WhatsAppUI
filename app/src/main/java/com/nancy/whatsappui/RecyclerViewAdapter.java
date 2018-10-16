package com.nancy.whatsappui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private Context mContext;
    private List<ModelClass> mList;

    public RecyclerViewAdapter(Context context,List<ModelClass> model) {
        this.mContext = context;
        mList = model;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layout = LayoutInflater.from(parent.getContext());
        View v = layout.inflate(R.layout.list_name,parent,false);

        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.name.setText(mList.get(position).getName());
        holder.text.setText(mList.get(position).getText());
        holder.time.setText(mList.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView text;
        TextView time;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            text = itemView.findViewById(R.id.text);
            time = itemView.findViewById(R.id.time);
        }
    }
}
