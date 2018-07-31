package com.haomostudio.JuniorSpringMVCTemplate.service;

import com.haomostudio.JuniorSpringMVCTemplate.po.HmUser;

import java.util.List;

public interface HmUserService {

    /***
     * 用户登录
     * @param user
     * @return
     */
    HmUser checkLogin(HmUser user);


    /**
     * 创建用户
     * @param user
     * @return
     */
    String   createNewUser(HmUser user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    String   updateUser(HmUser user);

    /**
     * 查询用户
     * @param HmUserId
     * @return
     */
    HmUser   selectUserById(String HmUserId);

    /***
     *查询多条用户
     */
    List<HmUser>   selectUserAll(String HmUserId);
}
