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

public class ProductTypeFragment extends Fragment {

    public ProductTypeAdapter productTypeListAdapter;
    private List<ProductTypePOJO> productTypeList;
    private RecyclerView recyclerViewProductList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_product_type, null);
        recyclerViewProductList = (RecyclerView) v.findViewById(R.id.recyclerViewProductList);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewProductList.setLayoutManager(llm);


        productTypeList = new ArrayList<>();


/* product adapter list*/

        ProductTypePOJO listPOJO = new ProductTypePOJO("Jimmys Roasting Beans", "12");
        ProductTypePOJO listPOJO1 = new ProductTypePOJO("Jimmys Roza", "12");
        ProductTypePOJO listPOJO2 = new ProductTypePOJO("Jimmys jims", "12");

        productTypeList.add(listPOJO);
        productTypeList.add(listPOJO1);
        productTypeList.add(listPOJO2);


        productTypeListAdapter = new ProductTypeAdapter(productTypeList, getActivity());
        recyclerViewProductList.setAdapter(productTypeListAdapter);

        /* product adapter list*/


        return v;
    }
}

