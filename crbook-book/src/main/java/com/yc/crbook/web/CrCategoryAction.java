package com.yc.crbook.web;

import com.yc.crbook.dao.ICrCategoryDao;
import com.yc.crbook.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-25 22:23
 */
@RestController
public class CrCategoryAction {
    @Resource
    private ICrCategoryDao cdao;

    @GetMapping("findRootCategory")
    public Result FindRootCategory() {
        return Result.success("ok", cdao.findByPidIsNull());
    }

}
