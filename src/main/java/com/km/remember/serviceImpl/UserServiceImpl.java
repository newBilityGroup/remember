package com.km.remember.serviceImpl;

import com.km.remember.dao.UserDao;
import com.km.remember.domain.User;
import com.km.remember.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String username) {
        return userDao.login(username);
    }
}
