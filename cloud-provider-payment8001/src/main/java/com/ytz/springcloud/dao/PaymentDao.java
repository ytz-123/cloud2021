package com.ytz.springcloud.dao;

import com.ytz.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface PaymentDao
{
    public int create(Payment payment);    //增

    public Payment getPaymentById(@Param("id") Long id); //查
}
