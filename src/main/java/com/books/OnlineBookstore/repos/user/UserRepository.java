package com.books.OnlineBookstore.repos.user;

import com.books.OnlineBookstore.models.user.UserBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserBean, Integer> {
    public List<UserBean> findByName(String name);
}
