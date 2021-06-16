package com.yc.crbook.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-17 20:43
 */
@Entity
@Table
@Data
public class CrLink {
    @Id
    private Long id;
    private String name;
    private String url;
    private Integer sort;
}
