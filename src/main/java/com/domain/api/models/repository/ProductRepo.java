package com.domain.api.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.domain.api.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{
    
}
