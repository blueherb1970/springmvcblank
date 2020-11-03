package org.example.service;

import org.example.domain.User;

public interface IUserService {

    /**
     * 根据 id 取得一个 User 对象
     * @param userId
     * @return
     */
    User getUser(Long userId);
}
