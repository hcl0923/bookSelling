package com.yc.crbookuser.dao;

import com.yc.crbook.bean.CrUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-22 18:47
 */
public interface UserDao extends JpaRepository<CrUser, Long> {

    CrUser findByAccountAndPwd(String account, String pwd);
}

