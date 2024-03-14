package com.books.OnlineBookstore.services.user;

import com.books.OnlineBookstore.models.user.UserBean;

import java.util.List;

public interface UserService {
    String save(UserBean userBean);

    List<UserBean> findByName(String name);
}
