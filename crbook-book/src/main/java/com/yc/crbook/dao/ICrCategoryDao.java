package com.yc.crbook.dao;

import com.yc.crbook.bean.CrCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-17 20:53
 */
public interface ICrCategoryDao extends JpaRepository<CrCategory, Long> {

    List<CrCategory> findByPidIsNull();
}
