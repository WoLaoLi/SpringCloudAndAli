package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2020/3/30
 * @description :
 */
@Mapper
public interface OrderDao
{
    //新建订单
    void create(@Param("order") Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}