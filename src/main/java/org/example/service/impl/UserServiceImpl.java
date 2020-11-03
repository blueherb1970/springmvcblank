package org.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.domain.User;
import org.example.service.IUserService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public User getUser(Long userId) {
        // 模拟从数据库中查询
        if(userId == null || userId != 1L) {
            log.error("userId 参数不正确");
            return null;
        }

        User user = new User();
        user.setUserId(userId);
        user.setUsername("Lily");
        user.setPassword("123456");
        user.setAge(16);

        return user;
    }
}
