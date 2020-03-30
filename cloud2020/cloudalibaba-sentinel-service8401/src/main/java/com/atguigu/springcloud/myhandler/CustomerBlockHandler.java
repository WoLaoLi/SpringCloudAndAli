package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2020/3/29
 * @description :
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(6666,"按客户自定义,global handlerException-----1");
    }


    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(6666,"按客户自定义,global handlerException-----2");
    }

}
