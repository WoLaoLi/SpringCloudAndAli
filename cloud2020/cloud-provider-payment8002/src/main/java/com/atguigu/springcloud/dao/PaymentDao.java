package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2020/3/7
 * @description :
 */
@org.apache.ibatis.annotations.Mapper
public interface PaymentDao extends Mapper<Payment> {


    int create(@Param("payment") Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
