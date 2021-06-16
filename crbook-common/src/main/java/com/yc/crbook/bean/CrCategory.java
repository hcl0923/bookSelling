package com.yc.crbook.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-17 20:43
 */
@Entity
@Table
@Data
public class CrCategory {
    @Id
    private Long id;
    private String name;
    private Long pid;
    
    //一对多关联查询
    @OneToMany
    @JoinColumn(name = "pid")
    private List<CrCategory> children;
}
