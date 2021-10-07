package com.example.module_find;

import android.content.Context;
import android.content.Intent;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.export_find.bean.FindInfo;
import com.example.export_find.router.FindRouterTable;
import com.example.export_find.service.IFindService;

/**
 * 购物车组件服务的实现
 * @author hufeiyang
 */
@Route(path = FindRouterTable.PATH_SERVICE_CART)
public class FindServiceImpl implements IFindService {

    @Override
    public FindInfo getProductCountInCart() {
        FindInfo cartInfo = new FindInfo();
        cartInfo.productCount = 666;
        return cartInfo;
    }

    @Override
    public void jumpToFindActivity(Context context) {
        Intent intent =new Intent(context,FindDetailActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void init(Context context) {
        //初始化工作，服务注入时会调用
    }
}
