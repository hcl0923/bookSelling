package com.yc.crbookindex.web;

import com.yc.crbook.bean.CrShow;
import com.yc.crbook.bean.CrShow1;
import com.yc.crbook.vo.Result;
import org.springframework.stereotype.Component;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-22 16:52
 */
@Component
public class CrBookBookActionImpl implements ICrBookBookAction {

    @Override
    public Result queryByPage(CrShow crShow) {
        //手动构建result =>data=>List==>8个CrShow ==》CrBook
        return new Result();
    }

    @Override
    public Result queryByPage1(CrShow1 crShow1) {
        //手动构建result =>data=>List==>8个CrShow ==》CrBook
        return new Result();
    }
}
