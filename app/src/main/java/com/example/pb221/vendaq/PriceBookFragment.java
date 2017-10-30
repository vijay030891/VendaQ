package com.example.pb221.vendaq;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pb221 on 29-10-2017.
 */

public class PriceBookFragment extends Fragment {

    public PriceBookAdapter priceBookAdapter;
    private List<PriceBooksPOJO> priceBookList;
private Button btnAddPriceBook;
    private RecyclerView recyclerViewProductList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_price_books, null);
        recyclerViewProductList = (RecyclerView) v.findViewById(R.id.recyclerViewProductList);
        btnAddPriceBook = (Button) v.findViewById(R.id.btnAddPriceBook);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewProductList.setLayoutManager(llm);


        priceBookList = new ArrayList<>();

/* product adapter list*/

        PriceBooksPOJO priceBookPOJO1 = new PriceBooksPOJO("General Price Book(All Products)","All Customers","All Outlet", "12/08/2017","12/09/2017","27 Sep 2017 1:47 pm");
        PriceBooksPOJO priceBookPOJO2 = new PriceBooksPOJO("General Price Book(All Products)","All Customers","All Outlet", "12/08/2017","12/09/2017","27 Sep 2017 1:47 pm");
        PriceBooksPOJO priceBookPOJO3 = new PriceBooksPOJO("General Price Book(All Products)","All Customers","All Outlet", "12/08/2017","12/09/2017","27 Sep 2017 1:47 pm");

        priceBookList.add(priceBookPOJO1);
        priceBookList.add(priceBookPOJO2);
        priceBookList.add(priceBookPOJO3);

        priceBookAdapter = new PriceBookAdapter(priceBookList, getActivity());
        recyclerViewProductList.setAdapter(priceBookAdapter);


        /* product adapter list*/


        return v;
    }
}

