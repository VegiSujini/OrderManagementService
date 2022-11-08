package com.example.OrderManagementService.Service;

import com.example.OrderManagementService.Model.Order;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
@ComponentScan(basePackages = {"com.example.OrderManagementService.Service"})
public interface OrderService {
    Order placeOrder(Order order);
    Order updateOrder(Order updateOrder);
    boolean deleteOrderByorderId(Long id);
    List<Order> viewOrderByorderId(Long id);
}
