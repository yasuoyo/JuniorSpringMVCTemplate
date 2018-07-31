package com.haomostudio.JuniorSpringMVCTemplate.controller;


import com.haomostudio.JuniorSpringMVCTemplate.po.HmUser;
import com.haomostudio.JuniorSpringMVCTemplate.service.HmUserService;
import com.haomostudio.Util.ResultVO;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/account")
public class AccountController {


    @Autowired
    private HmUserService userService;

    @RequestMapping("/login")
    public ResultVO login(HmUser user, HttpServletRequest request) {
        try {

            HmUser  users = userService.checkLogin(user);
            if ( users == null) {
                return ResultVO.build(-1, "用户名或密码为空");
            }
            if (users.getPassword() == null) {
                return ResultVO.build(-1, "密码为空");
            }
            if (!DigestUtils.md5Hex(users.getPassword()).equals(users.getPassword())) {
                return ResultVO.build(-1, "密码错误");
            }
            users.setPassword(null);
            request.getSession().setAttribute("user",users);

        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.build(-1, "登陆失败");
        }
        return ResultVO.ok();
    }

    @RequestMapping("/logout")
    public ResultVO loginOut(HttpServletRequest request) {

        try {

            HmUser user = (HmUser) request.getSession().getAttribute("user");

            if (user != null) {
                request.getSession().invalidate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return ResultVO.build(-1, "退出异常");

    }

}
