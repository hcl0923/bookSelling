package com.yc.crbookuser.web;

import com.yc.crbook.bean.CrUser;
import com.yc.crbook.biz.BizException;
import com.yc.crbook.vo.Result;
import com.yc.crbookuser.biz.UserBiz;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @program: shop-book
 * @description:
 * @author: 作者
 * @create: 2021-05-22 18:47
 */
@RestController
public class UserAction {
    @Resource
    private UserBiz userBiz;

    @GetMapping("sid")
    public String sid(HttpSession session, HttpServletRequest request) {
        return session.getId() + ":" + request.getServerPort();
    }

    @PostMapping("login")
    public Result login(@Valid CrUser user, Errors errors, HttpSession session) {
        if (errors.hasFieldErrors("account") || errors.hasFieldErrors("pwd")) {
            return Result.failure("输入错误", errors.getFieldErrors());//不带s随机返回一个
        }
        try {
            CrUser dbUser = userBiz.login(user);
            session.setAttribute("loginedUser", dbUser);
            return Result.success("登录成功", errors.getFieldError());
        } catch (BizException e) {
            e.printStackTrace();
            //自定义错误信息
            errors.reject("accountOrPwdError", e.getMessage());
            return Result.success(e.getMessage(), errors.getAllErrors());
        }
    }

    @GetMapping("getLoginedUser")
    public Result getLoginedUser(@SessionAttribute(required = false) CrUser loginedUser) {
        return Result.success("登录对象获取成功！", loginedUser);
    }

    /**
     * mav
     */
    @GetMapping("logout")
    public ModelAndView logout(ModelAndView mav, HttpSession session) {
        session.invalidate();
        mav.setViewName("redirect:http://127.0.0.1");
        return mav;
    }

}
