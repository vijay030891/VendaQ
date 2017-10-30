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

public class SupplierFragment extends Fragment {

    public SupplierAdapter supplierListAdapter;
    private List<SupplierPOJO> supplierList;
    private RecyclerView recyclerViewProductList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_supplier, null);
        recyclerViewProductList = (RecyclerView) v.findViewById(R.id.recyclerViewProductList);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewProductList.setLayoutManager(llm);


        supplierList = new ArrayList<>();


/* product adapter list*/

        SupplierPOJO listPOJO = new SupplierPOJO("Jimmys Roasting Beans", "Lorem Ipsum","0","12");
        SupplierPOJO listPOJO1 = new SupplierPOJO("Jimmys Roasting Beans", "Lorem Ipsum","0","12");
        SupplierPOJO listPOJO2 = new SupplierPOJO("Jimmys Roasting Beans", "Lorem Ipsum","0","12");

        supplierList.add(listPOJO);
        supplierList.add(listPOJO1);
        supplierList.add(listPOJO2);


        supplierListAdapter = new SupplierAdapter(supplierList, getActivity());
        recyclerViewProductList.setAdapter(supplierListAdapter);

        /* product adapter list*/


        return v;
    }
}

