package com.symplifica.demoSymplifica.services;

import com.symplifica.demoSymplifica.entity.Order;
import com.symplifica.demoSymplifica.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class OrderServiceImplementation implements OrderService{
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long id, Order order) {
        Order ofTheOrder = orderRepository.findById(id).get();
        if(Objects.nonNull(order.getProductId()) && !"".equalsIgnoreCase(String.valueOf(order.getProductId()))){
            ofTheOrder.setProductId(order.getProductId());
        }
        return orderRepository.save(ofTheOrder);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> listAllOrders() {
        return orderRepository.findAll();
    }

//    @Override
//    public Optional<Order> findProductByIdOrderJPQL(Long id, Order order){
//        return orderRepository.findProductByIdOrderJPQL(id, order);
//    }
}
