package com.domain.api.models.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.domain.api.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findByNameContains(String name);
}
