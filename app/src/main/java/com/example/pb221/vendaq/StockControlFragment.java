package com.example.pb221.vendaq;

import android.app.Dialog;
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

public class StockControlFragment extends Fragment {

    public StockControlAdapter stockControlListAdapter;
    private List<StockControlPOJO> stockControlPOJOList;
    private RecyclerView recyclerViewProductList;
    private Button btnAddStock;
    private Button btnRemoveStock;
    private Button btnTransferStock;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_stock_control, null);
        recyclerViewProductList = (RecyclerView) v.findViewById(R.id.recyclerViewProductList);
        btnAddStock = (Button) v.findViewById(R.id.btnAddStock);
        btnRemoveStock = (Button) v.findViewById(R.id.btnRemoveStock);
        btnTransferStock = (Button) v.findViewById(R.id.btnTransferStock);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewProductList.setLayoutManager(llm);


        stockControlPOJOList = new ArrayList<>();


/* product adapter list*/

        StockControlPOJO listPOJO = new StockControlPOJO("Order-Thu 12 Oct 2017", "Supplier order", "12 Oct 2017", "09 Oct 2017", "MAI-4", "Maain Outlet", "No Name", "Open", "0", "Rs 0.00");
        StockControlPOJO listPOJO1 = new StockControlPOJO("Order-Thu 12 Oct 2017", "Supplier order", "12 Oct 2017", "-", "MAI-4", "Maain Outlet", "No Name", "Open", "0", "Rs 0.00");
        StockControlPOJO listPOJO2 = new StockControlPOJO("Order-Thu 12 Oct 2017", "Supplier order", "12 Oct 2017", "09 Oct 2017", "MAI-4", "Maain Outlet", "No Name", "Open", "0", "Rs 0.00");
        StockControlPOJO listPOJO3 = new StockControlPOJO("Order-Thu 12 Oct 2017", "Supplier order", "12 Oct 2017", "-", "MAI-4", "Maain Outlet", "No Name", "Open", "0", "Rs 0.00");

        stockControlPOJOList.add(listPOJO);
        stockControlPOJOList.add(listPOJO1);
        stockControlPOJOList.add(listPOJO2);
        stockControlPOJOList.add(listPOJO3);


        stockControlListAdapter = new StockControlAdapter(stockControlPOJOList, getActivity());
        recyclerViewProductList.setAdapter(stockControlListAdapter);

        /* product adapter list*/
        btnAddStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create custom dialog object
                final Dialog dialog = new Dialog(getActivity());
                // Include dialog.xml file
                dialog.setContentView(R.layout.dialog_add_stock);
                // Set dialog title
                dialog.setTitle("Custom Dialog");

                // set values for custom dialog components - text, image and button

                dialog.show();

            }
        });
        btnRemoveStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getActivity());
                // Include dialog.xml file
                dialog.setContentView(R.layout.dialog_remove_stock);
                // Set dialog title
                dialog.setTitle("Custom Dialog");

                dialog.show();
            }
        });
        btnTransferStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getActivity());
                // Include dialog.xml file
                dialog.setContentView(R.layout.dialog_new_price_book);
                // Set dialog title
                dialog.setTitle("Custom Dialog");

                // set values for custom dialog components - text, image and button

                dialog.show();
            }
        });

        return v;
    }
}
