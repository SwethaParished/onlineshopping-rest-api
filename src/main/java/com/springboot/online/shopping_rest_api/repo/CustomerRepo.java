package com.springboot.online.shopping_rest_api.repo;

import com.springboot.online.shopping_rest_api.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepo extends JpaRepository<Products, Integer> {
}
