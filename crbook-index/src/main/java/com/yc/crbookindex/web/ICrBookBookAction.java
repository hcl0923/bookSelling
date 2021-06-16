package com.yc.crbookindex.web;

import com.yc.crbook.bean.CrShow;
import com.yc.crbook.bean.CrShow1;
import com.yc.crbook.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: shop-book
 * @description:Feign接口对应一个服务
 * @author: 作者
 * @create: 2021-05-22 16:03
 */
@FeignClient(value = "crbook-book", fallback = CrBookBookActionImpl.class)
public interface ICrBookBookAction {
    @GetMapping("queryByPage")
    public Result queryByPage(CrShow crShow);

    @GetMapping("queryByPage1")
    public Result queryByPage1(CrShow1 crShow1);
}
