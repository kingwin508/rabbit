package com.drhui.rabbit.user.controllor;

import com.drhui.rabbit.user.model.UmsMember;
import com.drhui.rabbit.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index()
    {
        return "hello user";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser()
    {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
}
