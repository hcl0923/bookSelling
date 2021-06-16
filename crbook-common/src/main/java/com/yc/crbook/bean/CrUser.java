package com.yc.crbook.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
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
public class CrUser implements Serializable {
    private static final long serialVersionUID = -5903322614599167518L;
    @Id
    private Long id;
    @NotEmpty(message = "请输入账号！")
    @Length(min = 6, max = 20, message = "密码必须是6到20个字符")
    private String account;
    private String name;
    @NotEmpty(message = "请输入密码！")
    @Length(min = 6, max = 20, message = "密码必须是6到20个字符")
    private String pwd;
    private String gender;
    private Timestamp birthday;
    private String address;
    private String phone;
    private String email;
    private String school;
    private String education;
    private String profession;
    private String job;
}
