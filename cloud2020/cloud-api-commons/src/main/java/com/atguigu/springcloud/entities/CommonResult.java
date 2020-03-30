package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2020/3/7
 * @description :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public  CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
