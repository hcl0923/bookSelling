package com.yc.crbookuser;

import com.yc.crbook.bean.CrCart;
import com.yc.crbook.bean.CrShow;
import com.yc.crbookuser.dao.CrCartMapper;
import com.yc.crbookuser.dao.CrShowMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class CrbookUserApplicationTests {

    @Resource
    private CrCartMapper crCartMapper;

    @Test
    void contextLoads() {
        System.out.println(crCartMapper.selectAll());
    }

    @Test
    void testSelect() {
        System.out.println(crCartMapper.selectAll());
        System.out.println(crCartMapper.selectById(1));
        System.out.println(crCartMapper.selectByUidAndBid(1, 57));
        CrCart crCart = new CrCart();
        crCart.setUid(1L);
        crCart.setBid(57L);
        System.out.println(crCartMapper.selectByUidAndBid1(crCart));
    }

    @Test
    void testInsert() {
        CrCart crCart = new CrCart();
        crCart.setUid(1L);
        crCart.setBid(58L);
        crCart.setCnt(10);
        System.out.println(crCart);
        crCartMapper.insert(crCart);
        System.out.println(crCart);
    }

    @Test
    void testSelect1() {
        CrCart crCart = null;
        crCartMapper.selectByObj(crCart);//select * from cr_cart

        crCart = new CrCart();
        crCartMapper.selectByObj(crCart);//select * from cr_cart

        crCart.setId(100L);
        crCartMapper.selectByObj(crCart);//select * from cr_cart where id=100
        crCart.setBid(100L);
        crCartMapper.selectByObj(crCart);//select * from cr_cart where id=100 and bid=100
        crCart.setId(null);
        crCart.setUid(100L);
        crCartMapper.selectByObj(crCart);//select * from cr_cart where uid=100 and bid=100
        crCart.setId(200L);
        crCartMapper.selectByObj(crCart);//select * from cr_cart where uid=100 and bid=100 and id=200

    }

    @Resource
    private CrShowMapper crShowMapper;

    @Test
    void testSelect2() {
        CrShow crShow = new CrShow();
        crShow.setPage("index");
        crShow.setBoard("编辑推荐");
        System.out.println("==========1==========");
        List<CrShow> list = crShowMapper.selectByPageAndBoard(crShow);

        System.out.println("==========2==========");
        System.out.println(list.size());

        System.out.println("==========3==========");
        System.out.println(list.get(0).getRelatb());

        System.out.println("==========4==========");
        System.out.println(list.get(0).getCrBook().getName());
        System.out.println("==========5==========");
        
    }
}
