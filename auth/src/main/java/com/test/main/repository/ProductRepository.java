package com.test.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.main.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	

}
