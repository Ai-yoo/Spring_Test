package com.du.test1;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/4
 * @Time 16:46
 */
@Controller("userController")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    public void run() {
        this.userService.run();
        System.out.println("userController  run!!");
    }
}
