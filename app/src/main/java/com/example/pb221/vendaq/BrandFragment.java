package com.example.pb221.vendaq;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pb221 on 29-10-2017.
 */

public class BrandFragment extends Fragment {

    public BrandAdapter brandListAdapter;
    private List<BrandPOJO> brandList;

    private RecyclerView recyclerViewProductList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_brands, null);
        recyclerViewProductList = (RecyclerView) v.findViewById(R.id.recyclerViewProductList);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewProductList.setLayoutManager(llm);


        brandList = new ArrayList<>();

         /* Brand adapter list*/

        BrandPOJO brandPojo1 = new BrandPOJO("Jimmys Roasting Beans", "Lorem Ipsum", "12");
        BrandPOJO brandPojo2 = new BrandPOJO("Jimmys Roasting Beans", "Lorem Ipsum", "12");
        BrandPOJO brandPojo3 = new BrandPOJO("Jimmys Roasting Beans", "Lorem Ipsum", "12");

        brandList.add(brandPojo1);
        brandList.add(brandPojo2);
        brandList.add(brandPojo3);

        brandListAdapter = new BrandAdapter(brandList, getActivity());
        recyclerViewProductList.setAdapter(brandListAdapter);

          /* Brand adapter list*/


        return v;
    }
}

