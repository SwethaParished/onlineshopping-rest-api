package com.springboot.online.shopping_rest_api.repo;

import com.springboot.online.shopping_rest_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<Product, Integer> {
}
