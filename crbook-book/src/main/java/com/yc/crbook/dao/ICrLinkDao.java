package com.yc.crbook.dao;

import com.yc.crbook.bean.CrLink;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-17 20:53
 */
public interface ICrLinkDao extends JpaRepository<CrLink, Long> {
}
