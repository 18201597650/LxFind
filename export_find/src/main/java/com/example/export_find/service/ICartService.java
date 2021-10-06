package com.example.export_find.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.example.export_find.bean.CartInfo;

/**
 * 购物车组件对外暴露的服务
 * @author hufeiyang
 */
public interface ICartService extends IProvider {

    /**
     * 获取购物车中商品数量
     * @return
     */
    CartInfo getProductCountInCart();
}
