package com.example.pb221.vendaq;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MenuItem mSearchItem;
    private SearchView sv;
    private DrawerLayout drawer;
    ActionBarDrawerToggle mDrawerToggle;
    private FrameLayout frameLayoutcontainer;
    private ListView leftList;
    private ListView rightList;
    private String[] leftListStrings;


    public DrowerOutsidePOJO drawerListdapter;
    public CashManagementAdapter cashListAdapter;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    private List<DrowerOutsidePOJO> drawerOutsideList;
    private List<DrowerOutsidePOJO> leftDraweList;
    private List<DrowerOutsidePOJO> drawerOutsideListProduct;
    private List<BrandPOJO> brandList;
    private List<CashManagementPOJO> cashList;

    private String[] rightListStrings;
//    private RecyclerView recyclerViewProductList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTheme(R.style.DrawerArrowStyle);
        frameLayoutcontainer = (FrameLayout) findViewById(R.id.frameLayoutcontainer);
        drawer = (DrawerLayout) findViewById(R.id.drawer);
        leftList = (ListView) findViewById(R.id.left_list);
        rightList = (ListView) findViewById(R.id.right_list);
        rightList.setVisibility(View.GONE);


//        recyclerViewProductList = (RecyclerView) findViewById(R.id.recyclerViewProductList);
        drawerOutsideList = new ArrayList<>();
        drawerOutsideListProduct = new ArrayList<>();
        leftDraweList = new ArrayList<>();

        DrowerOutsidePOJO leftListPOJO = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Sell", false);
        DrowerOutsidePOJO leftListPOJO1 = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Products", false);

        leftDraweList.add(leftListPOJO);
        leftDraweList.add(leftListPOJO1);


        DrowerOutsidePOJO listPOJO = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Sell Screen", false);
        DrowerOutsidePOJO listPOJO1 = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Sales History", false);
        DrowerOutsidePOJO listPOJO2 = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Cash Management", false);
        DrowerOutsidePOJO listPOJO3 = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Close Register", false);
        DrowerOutsidePOJO listPOJO4 = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Dashboard", false);
        DrowerOutsidePOJO listPOJO5 = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Settings", false);

        DrowerOutsidePOJO listPOJOProduct = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Products", false);
        DrowerOutsidePOJO listPOJO1Product = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Stock Control", false);
        DrowerOutsidePOJO listPOJO2Product = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Price Books", false);
        DrowerOutsidePOJO listPOJO3Product = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Product Types", false);
        DrowerOutsidePOJO listPOJO4Product = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Suppliers", false);
        DrowerOutsidePOJO listPOJO5Product = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Brands", false);
        DrowerOutsidePOJO listPOJO6Product = new DrowerOutsidePOJO(R.drawable.ic_down_arrow, "Product Tags", false);

        drawerOutsideList.add(listPOJO);
        drawerOutsideList.add(listPOJO1);
        drawerOutsideList.add(listPOJO2);
        drawerOutsideList.add(listPOJO3);
        drawerOutsideList.add(listPOJO4);
        drawerOutsideList.add(listPOJO5);

        drawerOutsideListProduct.add(listPOJOProduct);
        drawerOutsideListProduct.add(listPOJO1Product);
        drawerOutsideListProduct.add(listPOJO2Product);
        drawerOutsideListProduct.add(listPOJO3Product);
        drawerOutsideListProduct.add(listPOJO4Product);
        drawerOutsideListProduct.add(listPOJO5Product);
        drawerOutsideListProduct.add(listPOJO6Product);


        leftList.setAdapter(new MayAdapter(MainActivity.this, R.layout.drawer_list_row, leftDraweList));

        leftList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {


                if (arg2 == 0) {

                    rightListStrings = getResources().getStringArray(R.array.right1);

                    rightList.setAdapter(new MayAdapter(MainActivity.this, R.layout.drawer_list_row, drawerOutsideList));
                    rightList.setVisibility(View.VISIBLE);
                }
                if (arg2 == 1) {

                    rightListStrings = getResources().getStringArray(R.array.right2);

                    rightList.setAdapter(new MayAdapter(MainActivity.this, R.layout.drawer_list_row, drawerOutsideListProduct));
                    rightList.setVisibility(View.VISIBLE);
                }
                if (arg2 == 2) {

                    rightListStrings = getResources().getStringArray(R.array.right3);

                    rightList.setAdapter(new MayAdapter(MainActivity.this, R.layout.drawer_list_row, drawerOutsideList));
                    rightList.setVisibility(View.VISIBLE);

                }
                if (arg2 == 3) {

                    rightListStrings = getResources().getStringArray(R.array.right3);

                    rightList.setAdapter(new MayAdapter(MainActivity.this, R.layout.drawer_list_row, drawerOutsideList));
                    rightList.setVisibility(View.VISIBLE);

                }
                if (arg2 == 4) {

                    rightListStrings = getResources().getStringArray(R.array.right3);

                    rightList.setAdapter(new MayAdapter(MainActivity.this, R.layout.drawer_list_row, drawerOutsideList));
                    rightList.setVisibility(View.VISIBLE);

                }
                if (arg2 == 5) {

                    rightListStrings = getResources().getStringArray(R.array.right3);

                    rightList.setAdapter(new MayAdapter(MainActivity.this, R.layout.drawer_list_row, drawerOutsideList));
                    rightList.setVisibility(View.VISIBLE);

                }
            }

        });


        rightList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                drawer.closeDrawers();


                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                if (arg2 == 0) {


                    ProductListFragment fragmentCashFragment = new ProductListFragment();
                    fragmentTransaction.replace(R.id.frameLayoutcontainer, fragmentCashFragment, "Product Fragment");
                    fragmentTransaction.commit();
                }
                if (arg2 == 1) {


                    StockControlFragment fragmentCashFragment = new StockControlFragment();
                    fragmentTransaction.replace(R.id.frameLayoutcontainer, fragmentCashFragment, "Product Fragment");
                    fragmentTransaction.commit();
                }
                if (arg2 == 2) {


                    PriceBookFragment fragmentPriceFragment = new PriceBookFragment();
                    fragmentTransaction.replace(R.id.frameLayoutcontainer, fragmentPriceFragment, "Price Book ");
                    fragmentTransaction.commit();

                }
                if (arg2 == 3) {

                    ProductTypeFragment fragmentProductType = new ProductTypeFragment();
                    fragmentTransaction.replace(R.id.frameLayoutcontainer, fragmentProductType, "Price Book ");
                    fragmentTransaction.commit();
//                    CashManagementFragment fragmentCashFragment = new CashManagementFragment();
//                    fragmentTransaction.add(R.id.frameLayoutcontainer, fragmentCashFragment, "Cash Management");
//                    fragmentTransaction.commit();


                }
                if (arg2 == 4) {


                    SupplierFragment fragmentBrand = new SupplierFragment();
                    fragmentTransaction.replace(R.id.frameLayoutcontainer, fragmentBrand, "Supplier");
                    fragmentTransaction.commit();

                }
                if (arg2 == 5) {

                    BrandFragment fragmentBrand = new BrandFragment();
                    fragmentTransaction.replace(R.id.frameLayoutcontainer, fragmentBrand, "Brands");
                    fragmentTransaction.commit();

                }
                if (arg2 == 6) {

                    ProductTagsFragment fragmentProductTags = new ProductTagsFragment();
                    fragmentTransaction.replace(R.id.frameLayoutcontainer, fragmentProductTags, "Product Tags");
                    fragmentTransaction.commit();

                }
            }

        });


        // Set the drawer toggle as the DrawerListener
//        getActionBar().setHomeAsUpIndicator(R.drawable.ic_drawer);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
//        getActionBar().setHomeButtonEnabled(true);
        drawer.setDrawerListener(new DrawerLayout.DrawerListener() {

            @Override
            public void onDrawerStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onDrawerSlide(View arg0, float arg1) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onDrawerOpened(View arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onDrawerClosed(View arg0) {
                // TODO Auto-generated method stub
                rightList.setVisibility(View.INVISIBLE);
            }
        });


    }


    class MayAdapter extends ArrayAdapter<DrowerOutsidePOJO> {

        List<DrowerOutsidePOJO> myList = null;

        public MayAdapter(Context context, int resource, List<DrowerOutsidePOJO> objects) {
            super(context, resource, objects);
            myList = objects;
        }

        public List<DrowerOutsidePOJO> getMyList() {
            return myList;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.drawer_list_row, null);//set layout for displaying items


            TextView tv = (TextView) convertView.findViewById(R.id.txtvwTitle);
            TextView tv2 = (TextView) convertView.findViewById(R.id.txtVwIsOpen);
            tv.setVisibility(View.GONE);
            tv2.setText(myList.get(position).getName());
            return convertView;
        }

        public void setMyList(List<DrowerOutsidePOJO> myList) {
            this.myList = myList;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_search) {
            return false;
        }
        return super.onOptionsItemSelected(item);
    }
}