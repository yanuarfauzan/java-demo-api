package com.domain.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.api.models.entities.Product;
import com.domain.api.models.repository.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product){
        return productRepo.save(product);
    }
    
    public Product findOne(Long id){
        return productRepo.findById(id).get();
    }

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public void removeOne(Long id){
        productRepo.deleteById(id);
    }

    public void findByName(String name){
        productRepo.findByNameContains(name);
    }
}
