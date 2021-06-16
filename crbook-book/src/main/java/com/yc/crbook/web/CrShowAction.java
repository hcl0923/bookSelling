package com.yc.crbook.web;

import com.yc.crbook.bean.CrShow;
import com.yc.crbook.bean.CrShow1;
import com.yc.crbook.dao.ICrShow1Dao;
import com.yc.crbook.dao.ICrShowDao;
import com.yc.crbook.vo.Result;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-19 19:30
 */
@RestController
public class CrShowAction {
    @Resource
    private ICrShowDao csd;
    @Resource
    private ICrShow1Dao csd1;

    @RequestMapping("queryByPage")
    private Result queryByPage(CrShow crShow) {
        crShow.setRelatb("cr_book");
        //构建JPA查询条件对象
        List<CrShow> list = csd.findAll(Example.of(crShow));
        Result res = Result.success("success", list);
        return res;
    }

    @RequestMapping("queryByPage1")
    private Result queryByPage1(CrShow1 crShow1) {
        crShow1.setRelatb("cr_article");
        //构建JPA查询条件对象
        List<CrShow1> list = csd1.findAll(Example.of(crShow1));
        Result res = Result.success("success", list);
        return res;
    }
}
