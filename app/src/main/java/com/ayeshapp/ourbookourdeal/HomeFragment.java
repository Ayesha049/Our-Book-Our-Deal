package com.ayeshapp.ourbookourdeal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private static final String TAG = "HomeFragment";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_home, container, false);

        LinearLayoutManager layoutManagerAcademic = new LinearLayoutManager(getActivity());
        layoutManagerAcademic.setOrientation(LinearLayoutManager.HORIZONTAL);

        LinearLayoutManager layoutManagerNonAcademic = new LinearLayoutManager(getActivity());
        layoutManagerNonAcademic.setOrientation(LinearLayoutManager.HORIZONTAL);

        RecyclerView recyclerViewAcademic = rootView.findViewById(R.id.recyclerview_academic);
        RecyclerView recyclerViewNonAcademic = rootView.findViewById(R.id.recyclerview_nonacademic);

        recyclerViewAcademic.setLayoutManager(layoutManagerAcademic);
        recyclerViewNonAcademic.setLayoutManager(layoutManagerNonAcademic);

        //vars
         ArrayList<String> mBookName = new ArrayList<>();
         ArrayList<String> mImageUrls = new ArrayList<>();

        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mBookName.add("Havasu Falls");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mBookName.add("Trondheim");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mBookName.add("Portugal");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mBookName.add("Rocky Mountain National Park");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mBookName.add("Mahahual");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mBookName.add("Frozen Lake");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mBookName.add("White Sands Desert");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mBookName.add("Austrailia");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mBookName.add("Washington");

        ArrayList<String> mBookName1 = new ArrayList<>();
        ArrayList<String> mImageUrls1 = new ArrayList<>();

        mImageUrls1.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mBookName1.add("Havasu Falls");

        mImageUrls1.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mBookName1.add("Trondheim");

        mImageUrls1.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mBookName1.add("Portugal");

        mImageUrls1.add("https://i.redd.it/j6myfqglup501.jpg");
        mBookName1.add("Rocky Mountain National Park");


        mImageUrls1.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mBookName1.add("Mahahual");

        mImageUrls1.add("https://i.redd.it/k98uzl68eh501.jpg");
        mBookName1.add("Frozen Lake");


        mImageUrls1.add("https://i.redd.it/glin0nwndo501.jpg");
        mBookName1.add("White Sands Desert");

        mImageUrls1.add("https://i.redd.it/obx4zydshg601.jpg");
        mBookName1.add("Austrailia");

        mImageUrls1.add("https://i.imgur.com/ZcLLrkY.jpg");
        mBookName1.add("Washington");

        recyclerViewAcademic.setAdapter(new RecyclerViewAdapter(mBookName,mImageUrls,getContext()));
        recyclerViewNonAcademic.setAdapter(new RecyclerViewAdapter(mBookName1,mImageUrls1,getContext()));

        return rootView;

    }
}
