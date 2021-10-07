package com.example.export_find.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.example.export_find.bean.FindInfo;

/**
 * 购物车组件对外暴露的服务
 * @author hufeiyang
 */
public interface IFindService extends IProvider {

    /**
     * 获取购物车中商品数量
     * @return
     */
    FindInfo getProductCountInCart();

    void jumpToFindActivity(Context context);
}
