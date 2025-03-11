package com.ecommerce.ecommerceapplication.repository;

import com.ecommerce.ecommerceapplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository provides methods like findAll(), save(), deleteById(), etc,
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getAllProducts();
    //you can add custom query methods here if needed
}