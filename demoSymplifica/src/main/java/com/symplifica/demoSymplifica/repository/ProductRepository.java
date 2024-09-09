package com.symplifica.demoSymplifica.repository;

import com.symplifica.demoSymplifica.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
