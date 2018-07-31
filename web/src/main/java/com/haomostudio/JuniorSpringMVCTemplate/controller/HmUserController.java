package com.haomostudio.JuniorSpringMVCTemplate.controller;


import com.haomostudio.JuniorSpringMVCTemplate.po.HmUser;
import com.haomostudio.JuniorSpringMVCTemplate.service.HmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.haomostudio.Util.ResultVO;
import java.util.List;

@RestController
@RequestMapping("/hm_users")
public class HmUserController {

    @Autowired
    private HmUserService userService;

   @RequestMapping("/new")
    public ResultVO register( HmUser user) {

       String result = userService.createNewUser(user);

       if ("创建成功".equals(result)) {
           return ResultVO.build(200, result);
       }
       return ResultVO.build(-1, result);

    }

    @RequestMapping("/edit")
    public ResultVO update( HmUser user) {

        String result = userService.updateUser(user);

        if ("修改成功".equals(result)) {
            return ResultVO.build(200, result);
        }
        return ResultVO.build(-1, result);
    }

    @RequestMapping("/select")
    public ResultVO select( String HmUserId) {
         HmUser  user = userService.selectUserById(HmUserId);
        return ResultVO.ok(user);
    }


    @RequestMapping("/selectAll")
    public ResultVO selectALL( String HmUserId) {
        List<HmUser>  user = userService.selectUserAll(HmUserId);
        return ResultVO.ok(user);
    }


}
