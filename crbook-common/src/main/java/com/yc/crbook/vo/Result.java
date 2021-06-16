package com.yc.crbook.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: shop-book
 * @description:Ajax返回结果对象==》json
 * @author: 作者
 * @create: 2021-05-19 19:12
 */
@Data
public class Result implements Serializable {
    private static final long serialVersionUID = -6355812449143858281L;

    private Integer code;//返回码  1 success  0 fail
    private String msg;//返回消息
    private Object data;

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(String msg, Object data) {
        return new Result(1, msg, data);
    }

    public static Result failure(String msg, Object data) {
        return new Result(0, msg, data);
    }

}
