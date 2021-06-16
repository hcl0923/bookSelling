package com.yc.crbook.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-17 20:43
 */
@Entity
@Table
@Data
public class CrBook {
    @Id
    private Long id;
    private String name;
    private Integer category1;
    private Integer category2;
    private Integer category3;
    private String pic;
    private BigDecimal price;
    private String author;
    private String publisher;
    private Timestamp pressDate;
    private String isbn;
    private String pressSn;
    private String pages;
    private String words;
    private String printTime;
    private String bookSize;
    private String paper;
    private String printSn;
    private String packing;
    private String format;
    private String abst;
    private String contentIntro;
    private String authorIntro;
    private String catalog;
    private String extract;

}
