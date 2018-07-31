package com.haomostudio.JuniorSpringMVCTemplate.service.impl;

import com.haomostudio.JuniorSpringMVCTemplate.dao.HmUserMapper;
import com.haomostudio.JuniorSpringMVCTemplate.po.HmUser;
import com.haomostudio.JuniorSpringMVCTemplate.po.HmUserExample;
import com.haomostudio.JuniorSpringMVCTemplate.po.HmUserExample.Criteria;
import com.haomostudio.JuniorSpringMVCTemplate.service.HmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class HmUserServiceImpl implements HmUserService {

      @Autowired
      private HmUserMapper  userMapper;

       @Override
        public HmUser checkLogin(HmUser user) {
           HmUserExample userExample = new HmUserExample();
           Criteria  criteria = userExample.createCriteria();
           criteria.andUsernameEqualTo(user.getUsername());
           List<HmUser> list =userMapper.selectByExample(userExample);
           if (list != null && list.size() == 1) {
               return list.get(0);
           }
           return null;
    }

     @Override
    public String createNewUser(HmUser user) {
        if (user == null ) {
            return "请填写完整的信息";
        }
        if (user.getUsername()== null) {
            return "用户名名为必填项";
        }
        if (user.getLoginid()== null) {
            return "用户ID为必填项";
        }
        if (user.getPassword()== null) {
            return "用户密码为必填项";
        }
        if (user.getMobile()== null) {
            return "联系电话为必填项";
        }
        if (user.getEmail()== null) {
            return "邮箱为必填项";
        }
        if (user.getAvatar()== null) {
            return "头像为必填项";
        }

        int s1 = userMapper.insert(user);

        if (s1 > 0) {
            return "创建成功";
        }

        return  "创建失败";
    }

      @Override
     public String updateUser(HmUser user) {
          if (user == null) {
              return "请填写完整的信息";
          }
          if (user.getUsername() == null) {
              return "用户名名为必填项";
          }
          if (user.getLoginid() == null) {
              return "用户ID为必填项";
          }
          if (user.getPassword() == null) {
              return "用户密码为必填项";
          }
          if (user.getMobile() == null) {
              return "联系电话为必填项";
          }
          if (user.getEmail() == null) {
              return "邮箱为必填项";
          }
          if (user.getAvatar() == null) {
              return "头像为必填项";
          }

          int s2 = userMapper.updateByPrimaryKey(user);

          if (s2 > 0) {
              return "修改成功";
          }

          return "修改失败";
      }


          @Override
          public HmUser selectUserById(String HmUserId){
               if(HmUserId ==null){

                   return null;
               }
              HmUser user=userMapper.selectByPrimaryKey(HmUserId);
            return  user;
    }



       @Override
    public List<HmUser> selectUserAll(String HmUserId){
        if(HmUserId ==null){
            return null;
        }
        HmUserExample example = new HmUserExample();
        List<HmUser> list =userMapper.selectByExample(example);
        return  list;
    }




}
