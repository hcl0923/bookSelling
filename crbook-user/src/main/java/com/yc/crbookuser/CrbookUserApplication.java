package com.yc.crbookuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
//开启Reids会话共享
@EnableRedisHttpSession
@EntityScan("com.yc")
//设置映射器包扫瞄
@MapperScan("com.yc.crbookuser.dao")
//@ComponentScan("com.yc")
public class CrbookUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrbookUserApplication.class, args);
    }
}
