package com.example.module_find;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hfy.export_cart.router.CartRouterTable;

@Route(path = CartRouterTable.PATH_PAGE_CART)
public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction  transaction= manager.beginTransaction();
//        Fragment userFragment = CartFragment.newInstance("param1","param2");
//        transaction.add(R.id.fl_test_fragment, userFragment, "tag");
//        transaction.commit();
    }
}
