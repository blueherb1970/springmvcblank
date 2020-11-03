package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.domain.User;
import org.example.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class ViewController {

    private static final Logger logger = LoggerFactory.getLogger(ViewController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/home")
    public String homePage() {
        return "index";
    }

    @RequestMapping("showUser")
    public String showUser(Model model, Long userId) {
        log.info("获取用户信息, userId = {}", userId);
        log.trace("====> Start");
        User user = userService.getUser(userId);
        log.debug(user == null ? "null" : user.toString());
        model.addAttribute("user", user);
        if(user == null) {
            model.addAttribute("msg", "取得用户失败");
        } else {
            model.addAttribute("msg", "取得用户成功");
        }
        model.addAttribute("userId", userId);
        log.trace("<======== End");
        log.info("获取用户信息，userId = {} , 结果： {}", userId, (user == null ? "失败" : "成功"));
        return "showUser";
    }
}
