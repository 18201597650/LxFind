package com.example.export_find;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.export_find.bean.FindInfo;
import com.example.export_find.router.FindRouterTable;
import com.example.export_find.service.IFindService;

/**
 * 购物车组件服务工具类
 * 其他组件直接使用此类即可：页面跳转、获取服务。
 * @author hufeiyang
 */
public class FindServiceUtil {

    /**
     * 跳转到购物车页面
     * @param param1
     * @param param2
     */
    public static void navigateCartPage(String param1, String param2){
        ARouter.getInstance()
                .build(FindRouterTable.PATH_PAGE_CART)
                .withString("key1",param1)
                .withString("key2",param2)
                .navigation();
    }

    /**
     * 获取服务
     * @return
     */
    public static IFindService getService(){
        //return ARouter.getInstance().navigation(ICartService.class);//如果只有一个实现，这种方式也可以
        return (IFindService) ARouter.getInstance().build(FindRouterTable.PATH_SERVICE_CART).navigation();
    }

    /**
     * 获取购物车中商品数量
     * @return
     */
    public static FindInfo getCartProductCount(){
        return getService().getProductCountInCart();
    }

}
