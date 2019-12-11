package com.qupeng.springcloud.controller;

import com.qupeng.springcloud.constants.Constant;
import com.qupeng.springcloud.model.Goods;
import com.qupeng.springcloud.model.ResultObject;
import com.qupeng.springcloud.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 查询所有商品
     *
     * @return
     */
    @RequestMapping("/service/goods")
    public ResultObject goods() {
        System.out.println("9100被执行...........");

         /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        String str = null;
        if (str == null) {
            throw new RuntimeException("Goods服务异常了.");
        }

        List<Goods> goodsList = goodsService.getAllGoods();
        return new ResultObject(Constant.ZERO, "查询成功", goodsList);
    }
}