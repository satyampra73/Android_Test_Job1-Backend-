package com.satyam.androidtestjobbackend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppAdapterViewHolder>{
    Context context;
    User[] data;

    public AppAdapter(Context context, User[] data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public AppAdapterViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.view_item,parent,false);
        return new AppAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder( AppAdapter.AppAdapterViewHolder holder, int position) {
        User user=data[position];
        holder.textView1.setText(user.getN_product_uniq_id());
        holder.textView2.setText(user.getN_state_uniq_id());
        holder.textView3.setText(user.getC_state_name());
        holder.textView4.setText(user.getEffective_from());
        holder.textView5.setText(user.getC_added_by_admin_user_id());
        holder.textView6.setText(user.getProduct_rate());
        holder.textView7.setText(user.getAdded_time());

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class AppAdapterViewHolder extends RecyclerView.ViewHolder{
        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;

    public AppAdapterViewHolder( View itemView) {
        super(itemView);
        textView1=itemView.findViewById(R.id.wr_text1);
        textView2=itemView.findViewById(R.id.wr_text2);
        textView3=itemView.findViewById(R.id.wr_text3);
        textView4=itemView.findViewById(R.id.wr_text4);
        textView5=itemView.findViewById(R.id.wr_text5);
        textView6=itemView.findViewById(R.id.wr_text6);
        textView7=itemView.findViewById(R.id.wr_text7);
    }
}
}
