package com.symplifica.demoSymplifica.repository;

import com.symplifica.demoSymplifica.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    //@Query("SELECT orders.id, product.name, product.price FROM Orders WHERE orders.productId = :product.Id")
    //Optional<Order> findProductByIdOrderJPQL(Long id, Order order);
}
