package com.example.OrderManagementService.Controller;

import com.example.OrderManagementService.Model.Order;
import com.example.OrderManagementService.ServiceImpl.OrderServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderController {
    private OrderServiceImpl orderServiceImpl;
    @PostMapping("/placingOrder")
    public Order placingOrder(@RequestBody Order order)
    {
       return  orderServiceImpl.placeOrder(order);
    }
    @PutMapping("/updatingorder/{id}")//updatingOrder
    public Order updatingOrder(@RequestBody Order order)
    {
        return orderServiceImpl.updateOrder(order);
    }
    @DeleteMapping("/deletingorder/{id}")
    public boolean deletingOrder(@PathVariable Long id)
    {
        return orderServiceImpl.deleteOrderByorderId(id);
    }

    @GetMapping("/vieworder/{id}")
    public List<Order> viewingOrder(@PathVariable Long id)
    {
        return orderServiceImpl.viewOrderByorderId(id);
    }
}
