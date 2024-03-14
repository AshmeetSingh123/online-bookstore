package com.books.OnlineBookstore.services.user.impl;

import com.books.OnlineBookstore.models.user.UserBean;
import com.books.OnlineBookstore.repos.user.UserRepository;
import com.books.OnlineBookstore.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;
    @Override
    public String save(UserBean user) {
        return userRepo.save(user).getName();
    }

    @Override
    public List<UserBean> findByName(String name) {
        return userRepo.findByName(name);
    }
}
