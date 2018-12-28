package org.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.test.dao.UserDao;
import org.test.po.UserInfo;
import org.test.service.IUserService;

import javax.xml.registry.infomodel.User;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("getUserList")
    @ResponseBody
    public String getUserList (){
        List<UserInfo> userList = new ArrayList<UserInfo>();
        userList = userService.getAllUsers();
        if (null != userList){
            System.out.println(userList.toString());
        }

        return "index";
    }

    @ResponseBody
    @RequestMapping("/findUserById")
    public String findUserById(Long id){
        UserInfo user = new UserInfo();
        user = userService.findById(1L);
        if (null != user){
            System.out.println(user);
        }
        return  "index";
    }

}
