package com.yc.crbookuser.biz;

import com.yc.crbook.bean.CrUser;
import com.yc.crbook.biz.BizException;
import com.yc.crbookuser.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-22 18:47
 */
@Service
public class UserBiz {
    @Resource
    private UserDao userDao;

    public CrUser login(CrUser user) throws BizException {
        CrUser db = userDao.findByAccountAndPwd(user.getAccount(), user.getPwd());
        if (db == null) {
            throw new BizException("用户名或密码错误！");
        }
        return db;
    }
}
