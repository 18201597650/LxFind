package com.example.module_find;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.export_find.router.FindRouterTable;

/**
 * Time:2021/10/7
 * Author:liuxiong
 * Description:
 */
@Route(path = FindRouterTable.PATH_PAGE_CART)
public class FindDetailActivity extends AppCompatActivity {
    public static void jump(Context context){
        Intent intent =new Intent(context, FindDetailActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_detail);

    }
}
