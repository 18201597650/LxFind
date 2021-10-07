package com.example.export_find.router;

/**
 * 购物车组件路由表
 * 即 购物车组件中 所有可以从外部跳转的页面 的路由信息
 * @author hufeiyang
 */
public interface FindRouterTable {

    /**
     * 购物车页面
     */
    String PATH_PAGE_CART = "/find/FindActivity";

    /**
     * 购物车fragment
     */
    String PATH_FRAGMENT_CART = "/find/FindFragment";

    /**
     * 购物车服务
     */
    String PATH_SERVICE_CART = "/find/service";

}
