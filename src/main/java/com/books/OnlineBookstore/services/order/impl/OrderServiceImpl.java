package com.books.OnlineBookstore.services.order.impl;

import com.books.OnlineBookstore.models.book.BookBean;
import com.books.OnlineBookstore.models.order.OrderBean;
import com.books.OnlineBookstore.repos.order.OrderRepository;
import com.books.OnlineBookstore.services.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public String save(OrderBean orderBean) {
        return orderRepository.save(orderBean).getOrderId();
    }

    @Override
    public OrderBean findById(String id) {
        Optional<OrderBean> result = orderRepository.findById(id);
        return result.orElse(null);
    }
}
