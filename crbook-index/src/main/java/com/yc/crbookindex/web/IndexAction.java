package com.yc.crbookindex.web;

import com.yc.crbook.bean.CrShow;
import com.yc.crbook.bean.CrShow1;
import com.yc.crbook.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-22 16:09
 */
@RestController
public class IndexAction {
    @Resource
    private ICrBookBookAction bookBookAction;

    @GetMapping("queryByPage")
    public Result queryByPage(CrShow crShow) {
        return bookBookAction.queryByPage(crShow);
    }

    @GetMapping("queryByPage1")
    public Result queryByPage1(CrShow1 crShow1) {
        return bookBookAction.queryByPage1(crShow1);
    }

}
