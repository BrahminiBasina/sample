package com.test.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.main.exception.ResourceNotFoundException;
import com.test.main.model.Product;
import com.test.main.service.ProductService;

@RestController
@RequestMapping("/Challengers/api")
public class ProductController {
	@Autowired
    private ProductService prodServ;

    @GetMapping("/product/view")
    public List<Product> getAllProducts() {
        return prodServ.getAllProducts();
    }
    
    @GetMapping("/product/view/{productId}")
    public ResponseEntity<Product> getEmployeeById(@PathVariable(value = "productId") Long productId)
            throws ResourceNotFoundException {
            Product product = prodServ.getProductById(productId)
              .orElseThrow(() -> new ResourceNotFoundException("product not found for this id :: " + productId));
            return ResponseEntity.ok().body(product);
    }
    
    @PostMapping("/product/add")
    public Product addProduct(@Valid @RequestBody Product product) {
        return prodServ.addProduct(product);
    }
    
    
    
       }
