package com.example.OrderManagementService.Repository;

import com.example.OrderManagementService.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
List<Order> viewOrderByorderId(Long id);
}
