package com.yc.crbook.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-17 20:43
 */
@Entity
@Table
@Data
public class CrShow {
    @Id
    private Long id;
    private String page;
    private String board;
    private String relatb;

    private Integer sort;
    //关联图书对象
    //private Integer relaid
    @OneToOne
    @JoinColumn(name = "relaid")
    private CrBook crBook;
}
