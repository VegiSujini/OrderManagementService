package com.example.OrderManagementService.ServiceImpl;

import com.example.OrderManagementService.Model.Order;
import com.example.OrderManagementService.Repository.OrderRepository;
import com.example.OrderManagementService.Service.OrderService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

   // public OrderServiceImpl(OrderRepository orderRepository) {
     //   this.orderRepository = orderRepository;
   // }

    @Override
    public Order placeOrder(Order order)
    {
        return  orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order updateOrder) {
        Order o=new Order();
        o.setOrderItemsName(updateOrder.getOrderItemsName());
        o.setQuantity(updateOrder.getQuantity());
        o.setTotalprice(updateOrder.getTotalprice());
        return orderRepository.save(updateOrder);
    }

    @Override
    public boolean deleteOrderByorderId(Long id) {
        orderRepository.deleteById(id);
        return true;
    }
    @Override
    public List<Order> viewOrderByorderId(Long id) {
        return orderRepository.viewOrderByorderId(id);
    }


}
