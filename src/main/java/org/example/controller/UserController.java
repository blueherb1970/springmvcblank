package org.example.controller;

import com.alibaba.fastjson.JSONObject;
import org.example.domain.User;
import org.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 新增
     *
     * 注解 RequestBody 要求 POST，并且 Content-Type: application/json，否则抛出异常
     *
     * @param user
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public JSONObject addUser(@RequestBody User user) {
        JSONObject json = new JSONObject();

        // 假设数据库操作已经完成
        if(user.getUsername() == null || "".equals(user.getUsername().trim())) {
            json.put("status", 404);
            json.put("msg", "失败");
        } else {
            json.put("status", 200);
            json.put("msg", "成功");
        }
        json.put("data", null);

        return json;
    }

    /**
     * 根据 userId 删除一个 User
     * @param userId
     * @return
     */
    @RequestMapping("delete")
    @ResponseBody
    public JSONObject deleteUser(Long userId) {
        JSONObject json = new JSONObject();

        // 假设已经删除完成
        if(userId == null) {
            json.put("status", 404);
            json.put("msg", "失败");
        } else {
            json.put("status", 200);
            json.put("msg", "成功");
        }
        json.put("data", null);

        return json;
    }

    /**
     * 根据 userId 取得一个 User
     * URL： /user/get/1.do  （web.xml 中拦截 *.do ）
     * @param userId
     * @return
     */
    @RequestMapping("get/{id}")
    @ResponseBody
    public JSONObject getUser(@PathVariable(value = "id") Long userId) {
        User user = userService.getUser(userId);

        JSONObject json = new JSONObject();
        json.put("data", user);

        if(user == null) {
            json.put("status", 404);
            json.put("msg", "失败");
        } else {
            json.put("status", 200);
            json.put("msg", "成功");
        }

        return json;
    }


}
