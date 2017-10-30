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

public class ProductListFragment extends Fragment {

    public ProductListAdapter productListAdapter;
    private List<ProductListPOJO> productList;
    private RecyclerView recyclerViewProductList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_products, null);
        recyclerViewProductList = (RecyclerView) v.findViewById(R.id.recyclerViewProductList);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewProductList.setLayoutManager(llm);


        productList = new ArrayList<>();


/* product adapter list*/

        ProductListPOJO listPOJO = new ProductListPOJO("Freshly Squeezed Juice", "27 Sep 2017", "Juice Orange", "-", "Summer S", "-", 50.7, 5);
        ProductListPOJO listPOJO1 = new ProductListPOJO("Freshly Squeezed Juice", "27 Sep 2017", "Juice Orange", "-", "Summer S", "-", 50.7, 5);
        ProductListPOJO listPOJO2 = new ProductListPOJO("Freshly Squeezed Juice", "27 Sep 2017", "Juice Orange", "-", "Summer S", "-", 50.7, 5);

        productList.add(listPOJO);
        productList.add(listPOJO1);
        productList.add(listPOJO2);


        productListAdapter = new ProductListAdapter(productList, getActivity());
        recyclerViewProductList.setAdapter(productListAdapter);

        /* product adapter list*/


        return v;
    }
}

