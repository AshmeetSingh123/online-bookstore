package com.books.OnlineBookstore.controllers.order;

import com.books.OnlineBookstore.models.order.OrderBean;
import com.books.OnlineBookstore.services.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/place")
    public String placeOrder(@RequestBody OrderBean orderBean){
        return orderService.save(orderBean);
    }

    @GetMapping("/findOrderById/{id}")
    public OrderBean getOrder(@PathVariable(name = "id") String id){
        return orderService.findById(id);
    }
}
