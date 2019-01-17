package com.test.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.main.model.Product;
import com.test.main.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository prodRepo;
	
	public List<Product> getAllProducts() {
        return prodRepo.findAll();
    }
 
    public Optional<Product> getProductById(Long id) {
        return prodRepo.findById(id);
    }
 
    public Product addProduct(Product product) {
       
        return prodRepo.save(product);
    }
 
   /* public void updateEmployee(Product product) {
        prodRepo.saveAndFlush(product);
    }
 
    public void deleteProdcut(Long id) {
        prodRepo.deleteById(id);
    }
    */
 
	
}
