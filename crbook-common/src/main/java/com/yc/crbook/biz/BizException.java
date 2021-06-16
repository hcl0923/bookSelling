package com.yc.crbook.biz;

/**
 * @program: shop-book
 * @description:自定义异常
 * @author: 作者
 * @create: 2021-05-19 19:16
 */
public class BizException extends Exception {
    private static final long serialVersionUID = 1530195490183092437L;

    public BizException() {
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    protected BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
