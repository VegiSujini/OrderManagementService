package com.example.OrderManagementService.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
  //  private Long restaurantId;
   // private Long paymentId;
    //private Long customerId;
    private  String orderItemsName;
    private Long quantity;
    private double totalprice;
 //   private Long orderTime;
   // private Long deliveryTime;

}
