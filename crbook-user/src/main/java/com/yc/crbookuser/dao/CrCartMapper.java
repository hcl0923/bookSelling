package com.yc.crbookuser.dao;

import com.yc.crbook.bean.CrCart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface CrCartMapper {
    /**
     * SQL语句
     * 1.注解    简单地SQL
     * 2.XML配置  复杂的sql,动态sql
     *
     * @return
     */
    @Select("select * from cr_cart")
    List<CrCart> selectAll();

    //带一个参数查询
    @Select("select * from cr_cart where id= #{id}")
    //任意名字都可以
    CrCart selectById(long id);

    //带多个参数查询
    @Select("select * from cr_cart where uid= #{uid} and bid =#{bid}")
    CrCart selectByUidAndBid(@Param("uid") long uid, @Param("bid") long bid);

    //带多个参数查询
    @Select("select * from cr_cart where uid= #{uid} and bid =#{bid}")
    CrCart selectByUidAndBid1(CrCart crCart);//实体类的属性名自动映射查询参数名

    //带多参数查询3 使用Map集合传参  key==》sql参数名

    //insert传参
    @Insert("insert into cr_cart values(default,#{uid},#{bid},#{cnt},now())")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    int insert(CrCart crCart);//        数据库的属性          bean的属性

    List<CrCart> selectByCnt(String cnt);

    List<CrCart> selectByObj(CrCart crCart);
    //@Update @Delete
}
