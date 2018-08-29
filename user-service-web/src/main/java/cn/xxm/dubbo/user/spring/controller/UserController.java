package cn.xxm.dubbo.user.spring.controller;

import cn.xxm.dubbo.pojo.User;
import cn.xxm.dubbo.user.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxm
 * @create 2018-08-29 23:07
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Long id){
        User user = userService.findOne(id);
        System.out.println("呵呵哒");
        return user;
    }
}
