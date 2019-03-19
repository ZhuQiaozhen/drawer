package com.drawer.imu.service;

import com.drawer.imu.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
