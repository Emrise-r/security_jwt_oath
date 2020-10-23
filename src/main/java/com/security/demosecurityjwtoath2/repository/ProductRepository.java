package com.security.demosecurityjwtoath2.repository;

import com.security.demosecurityjwtoath2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
