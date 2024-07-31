package com.springboot.online.shopping_rest_api.controller;

import com.springboot.online.shopping_rest_api.entity.Products;
import com.springboot.online.shopping_rest_api.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    Products products;


    @GetMapping("{productId}")
    public Products getProduct(Products products){ //product;
        return products;
        //new Product("1","dress","all size","2","5");
    }

    @PostMapping
    public String createProduct(@RequestBody Products products){
        this.products=products;
        return "Product created successfully";
    }

    @PutMapping
    public String updateProduct(@RequestBody Products products){
        this.products=products;
        return "Product updated successfully";
    }
    @DeleteMapping({"productId"})
    public String deleteProduct(String productId){
        return products + "Product deleted successfully";

    }
}