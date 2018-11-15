package io.github.agreatao.modules.business.controller;

import io.github.agreatao.modules.business.repository.entity.User;
import io.github.agreatao.modules.business.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    @ResponseBody
    public String save(String name, String phone, String password, Integer sex, Date birth) {
        try {
            User user = new User();
            user.setName(name);
            user.setPhone(phone);
            user.setPassword(password);
            user.setSex(sex);
            user.setBirth(birth);
            userService.save(user);
            return "save ok";
        } catch (Exception e) {
            return "save error";
        }

    }


}
