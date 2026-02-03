package com.hari.ecommerce.controller;

import com.hari.ecommerce.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.ecommerce.model.OrderRequest;
import com.hari.ecommerce.serviece.OrderService;

import java.util.List;

@RestController
@RequestMapping("/Orders")
@CrossOrigin("*")

public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/place/{userId}")
    public OrderDto placeOrder(@PathVariable Long userId, @RequestBody OrderRequest orderRequest)
    {
        return orderService.placeOrder(userId,orderRequest.getProductQuantities(),orderRequest.getTotalAmount());
    }

    @GetMapping("/all-Orders")
    public List<OrderDto> getAllOrders()
    {
        return orderService.getAllOrders();
    }

    @GetMapping("/User/{userId}")
    public List<OrderDto> getOrderByUser(@PathVariable Long userId)
    {
        return orderService.getOrderByUser(userId);
    }
}

