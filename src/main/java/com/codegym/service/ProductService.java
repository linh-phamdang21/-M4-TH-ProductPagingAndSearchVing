package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ProductService {
    public Page<Product> getAllProduct (Pageable pageable);

    public Page<Product> getAllByName(String name, Pageable pageable);

    public Product getById(Long id);

    void remove (Long id);

    void save(Product product);
}
