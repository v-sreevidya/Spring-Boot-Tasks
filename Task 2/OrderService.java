package com.example.task2.Service;

import com.example.task2.Entity.Order;
import com.example.task2.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public Order saveOrder(Order order) {
        if (order.getId() == 0) {
            // Setting createdDate only for new orders
            order.setCreatedDate(LocalDateTime.now());
        }
        // Update lastModifiedDate for both new and existing orders
        order.setLastModifiedDate(LocalDateTime.now());
        return orderRepo.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

    public Optional<Order> getOrderById(int id){
        return orderRepo.findById(id);
    }

    public void deleteOrder(int id){
        orderRepo.deleteById(id);
    }
}
