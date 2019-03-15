package com.example.acer.volleytutorial.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.acer.volleytutorial.R;
import com.example.acer.volleytutorial.details;
import com.example.acer.volleytutorial.model.BookModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookHolder>
{
    Context context;
    ArrayList<BookModel> bookModels;

    public BookAdapter(Context context, ArrayList<BookModel> bookModels)
    {
        this.context = context;
        this.bookModels = bookModels;
    }

    @NonNull
    @Override
    public BookAdapter.BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view=LayoutInflater.from(context).inflate(R.layout.item,parent,false);
      BookHolder bookHolder=new BookHolder(view);
        return bookHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.BookHolder holder, int position)
    {
        Picasso.with(context).load(bookModels.get(position).getImg()).placeholder(R.mipmap.ic_launcher).into(holder.imageView);
    }

    @Override
    public int getItemCount()
    {
        return bookModels.size();
    }

    public class BookHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        public BookHolder(View itemView)
        {

            super(itemView);
            imageView=itemView.findViewById(R.id.book_img);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=getAdapterPosition();
                    if (position!=RecyclerView.NO_POSITION){
                        Intent intent=new Intent(context, details.class);
                        intent.putExtra("author",bookModels.get(position).getAuthor());
                        intent.putExtra("title",bookModels.get(position).getBook_title());
                        intent.putExtra("desc",bookModels.get(position).getDesc());
                        intent.putExtra("imagelink",bookModels.get(position).getImg());
                        context.startActivity(intent);
                    }
                }
            });
        }
    }
}
