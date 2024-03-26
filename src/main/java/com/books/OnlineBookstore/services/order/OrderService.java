package com.books.OnlineBookstore.services.order;

import com.books.OnlineBookstore.models.order.OrderBean;
import org.springframework.stereotype.Service;

public interface OrderService {
    String save(OrderBean orderBean);

    OrderBean findById(String id);
}
