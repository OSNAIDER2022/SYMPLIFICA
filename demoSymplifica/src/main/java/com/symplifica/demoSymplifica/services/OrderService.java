package com.symplifica.demoSymplifica.services;

import com.symplifica.demoSymplifica.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface OrderService {
    Order saveOrder(Order order);
    Order updateOrder(Long id, Order order);
    void deleteOrder(Long id);
    List<Order> listAllOrders();
    //Optional<Order> findProductByIdOrderJPQL(Long id, Order order);
}
