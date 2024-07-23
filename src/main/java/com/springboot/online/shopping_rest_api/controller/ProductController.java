package com.springboot.online.shopping_rest_api.controller;

import com.springboot.online.shopping_rest_api.entity.Product;
import com.springboot.online.shopping_rest_api.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    Product product;

    @GetMapping("{productId}")
    public Product getProduct(String productId){ //product;
        return product;
                //new Product("1","dress","all size","2","5");
    }

    @PostMapping
    public String createProduct(@RequestBody Product product){
        this.product=product;
        return "Product created successfully";
    }

    @PutMapping
    public String updateProduct(@RequestBody Product product){
        this.product=product;
        return "Product updated successfully";
    }
@DeleteMapping({"productId"})
    public String deleteProduct(String productId){
        return product + "Product deleted successfully";

    }
}
