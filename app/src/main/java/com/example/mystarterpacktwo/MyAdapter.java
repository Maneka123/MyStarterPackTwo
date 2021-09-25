package com.example.mystarterpacktwo;




import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;

    ArrayList<Customer> list;


    public MyAdapter(Context context, ArrayList<Customer> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Customer user = list.get(position);
        holder.firstName.setText(user.getfName());
        holder.lastName.setText(user.getlName());
        holder.email.setText(user.email);
        holder.password.setText(user.getPassword());
        holder.contact.setText(user.getContact());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView firstName, lastName, email,password,contact;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            firstName = itemView.findViewById(R.id.tvfirstName);
            lastName = itemView.findViewById(R.id.tvlastName);
            email = itemView.findViewById(R.id.tvemail);
            password = itemView.findViewById(R.id.tvpassword);
            contact = itemView.findViewById(R.id.tvcontact);

        }
    }

}
