package com.yc.crbook.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
public class CrCart {
    @Id
    private Long id;
    private Long uid;
    private Long bid;
    private Integer cnt;
    private Timestamp datetime;

}

