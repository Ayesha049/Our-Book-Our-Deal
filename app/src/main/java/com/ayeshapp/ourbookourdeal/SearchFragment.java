package com.ayeshapp.ourbookourdeal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    private static final String TAG = "SearchFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_search, container, false);

        LinearLayoutManager layoutManagerSearch = new LinearLayoutManager(getActivity());
        layoutManagerSearch.setOrientation(LinearLayoutManager.VERTICAL);

        RecyclerView recyclerViewSearch = rootView.findViewById(R.id.recyclerview_search);
        recyclerViewSearch.setLayoutManager(layoutManagerSearch);

        ArrayList<Book> list = new ArrayList<>();
        SearchRecycleViewAdapter adapter = new SearchRecycleViewAdapter(list,getContext());
        recyclerViewSearch.setAdapter(adapter);

        Book book = new Book();

        book.setImageUrls("https://i.redd.it/qn7f9oqu7o501.jpg");
        book.setAuthorName("Andrew Ng");
        book.setBookName("Portugal");
        book.setEdition("5th edition");
        book.setPrice("200 BDT");
        list.add(book);

        book = new Book();

        book.setImageUrls("https://i.redd.it/tpsnoz5bzo501.jpg");
        book.setAuthorName("Andrew Ng2");
        book.setBookName("Trondheim");
        book.setEdition("6th edition");
        book.setPrice("300 BDT");
        list.add(book);

        book = new Book();

        book.setImageUrls("https://i.redd.it/j6myfqglup501.jpg");
        book.setAuthorName("Andrew Ng3");
        book.setBookName("Rocky Mountain National Park");
        book.setEdition("7th edition");
        book.setPrice("400 BDT");
        list.add(book);

        book = new Book();

        book.setImageUrls("https://i.redd.it/0h2gm1ix6p501.jpg");
        book.setAuthorName("Andrew Ng4");
        book.setBookName("Mahahual");
        book.setEdition("8th edition");
        book.setPrice("500 BDT");
        list.add(book);

        book = new Book();

        book.setImageUrls("https://i.redd.it/k98uzl68eh501.jpg");
        book.setAuthorName("Andrew Ng5");
        book.setBookName("Frozen Lake");
        book.setEdition("9th edition");
        book.setPrice("600 BDT");
        list.add(book);

        book = new Book();

        book.setImageUrls("https://i.redd.it/glin0nwndo501.jpg");
        book.setAuthorName("Andrew Ng6");
        book.setBookName("White Sands Desert");
        book.setEdition("1st edition");
        book.setPrice("700 BDT");
        list.add(book);

        book = new Book();

        book.setImageUrls("https://i.redd.it/obx4zydshg601.jpg");
        book.setAuthorName("Andrew Ng7");
        book.setBookName("Austrailia");
        book.setEdition("2nd edition");
        book.setPrice("800 BDT");
        list.add(book);

        book = new Book();

        book.setImageUrls("https://i.imgur.com/ZcLLrkY.jpg");
        book.setAuthorName("Andrew Ng8");
        book.setBookName("Washington");
        book.setEdition("3rd edition");
        book.setPrice("900 BDT");
        list.add(book);

        adapter.notifyDataSetChanged();
        return rootView;

    }
}
