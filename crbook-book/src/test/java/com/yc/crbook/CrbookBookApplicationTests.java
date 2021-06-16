package com.yc.crbook;

import com.yc.crbook.bean.CrLink;
import com.yc.crbook.bean.CrShow;
import com.yc.crbook.dao.ICrLinkDao;
import com.yc.crbook.dao.ICrShowDao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@SpringBootTest
public class CrbookBookApplicationTests {
    @Resource
    private ICrLinkDao crLinkDao;
    @Resource
    private ICrShowDao crShowDao;

    @Test
    @Transactional
    public void ContextLoads() {
        CrLink cl = crLinkDao.getOne(1L);
        System.out.println(cl);
        Assert.assertNotNull(cl);
    }

    @Test
    @Transactional
    public void ContextLoads1() {
        CrShow cs = crShowDao.getOne(1L);
        System.out.println(cs);
        Assert.assertNotNull(cs);
    }
}