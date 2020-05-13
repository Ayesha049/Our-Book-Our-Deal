package com.ayeshapp.ourbookourdeal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SearchRecycleViewAdapter extends RecyclerView.Adapter<SearchRecycleViewAdapter.myHolder>{

    ArrayList<Book> list;
    Context mContext;

    public SearchRecycleViewAdapter(ArrayList<Book> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_search, viewGroup, false);
        return new SearchRecycleViewAdapter.myHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder myHolder, int i) {

        Book book = list.get(i);

        Glide.with(mContext)
                .asBitmap()
                .load(book.getImageUrls())
                .into(myHolder.bookImage);

        myHolder.bookName.setText(book.getBookName());
        myHolder.authorName.setText(book.getAuthorName());
        myHolder.edition.setText(book.getEdition());
        myHolder.price.setText(book.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myHolder extends RecyclerView.ViewHolder{

        ImageView bookImage;
        TextView bookName;
        TextView authorName;
        TextView edition;
        TextView price;

        public myHolder(@NonNull View itemView) {
            super(itemView);

            bookImage = itemView.findViewById(R.id.book_image);
            bookName = itemView.findViewById(R.id.book_name);
            authorName = itemView.findViewById(R.id.author_name);
            edition = itemView.findViewById(R.id.edition);
            price = itemView.findViewById(R.id.money);
        }
    }
}
