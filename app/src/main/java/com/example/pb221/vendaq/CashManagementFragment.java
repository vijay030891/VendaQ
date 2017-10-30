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
 * Created by pb221 on 28-10-2017.
 */

public class CashManagementFragment extends Fragment {

    public CashManagementAdapter cashListAdapter;
    private List<CashManagementPOJO> cashList;
    private RecyclerView recyclerViewProductList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cash_management, null);
        recyclerViewProductList = (RecyclerView) v.findViewById(R.id.recyclerViewProductList);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewProductList.setLayoutManager(llm);


        cashList = new ArrayList<>();

             /* Cash Management adapter list*/

        CashManagementPOJO cashManagementPOJO1 = new CashManagementPOJO("12:01", "manager(manager)", "niranjanniur04@gmail.com", "Opening float", "1234.00");
        CashManagementPOJO cashManagementPOJO2 = new CashManagementPOJO("12:01", "manager(manager)", "niranjanniur04@gmail.com", "Opening float", "1234.00");
        CashManagementPOJO cashManagementPOJO3 = new CashManagementPOJO("12:01", "manager(manager)", "niranjanniur04@gmail.com", "Opening float", "1234.00");

        cashList.add(cashManagementPOJO1);
        cashList.add(cashManagementPOJO2);
        cashList.add(cashManagementPOJO3);

        cashListAdapter = new CashManagementAdapter(cashList, getActivity());
        recyclerViewProductList.setAdapter(cashListAdapter);

          /* Cash Management adapter list*/


        return v;
    }
}

