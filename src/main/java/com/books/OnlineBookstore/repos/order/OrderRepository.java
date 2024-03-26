package com.books.OnlineBookstore.repos.order;

import com.books.OnlineBookstore.models.order.OrderBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<OrderBean, String> {
}
