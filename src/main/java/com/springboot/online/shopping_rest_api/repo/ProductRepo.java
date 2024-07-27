package com.springboot.online.shopping_rest_api.repo;

import com.springboot.online.shopping_rest_api.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<Products, Integer> {
}
