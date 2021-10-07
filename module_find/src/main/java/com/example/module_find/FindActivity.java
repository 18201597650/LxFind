package com.example.module_find;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.export_find.router.FindRouterTable;

@Route(path = FindRouterTable.PATH_PAGE_CART)
public class FindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);


        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();
        Fragment userFragment = FindFragment.newInstance("param1","param2");
        transaction.add(R.id.fl_test_fragment, userFragment, "tag");
        transaction.commit();
    }
}
