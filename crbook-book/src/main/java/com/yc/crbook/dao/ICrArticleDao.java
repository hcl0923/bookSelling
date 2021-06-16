package com.yc.crbook.dao;

import com.yc.crbook.bean.CrArticle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-17 20:53
 */
public interface ICrArticleDao extends JpaRepository<CrArticle, Long> {
}
