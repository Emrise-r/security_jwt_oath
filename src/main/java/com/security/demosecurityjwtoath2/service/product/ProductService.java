package com.security.demosecurityjwtoath2.service.product;

import com.security.demosecurityjwtoath2.model.Product;

public interface ProductService {

    Iterable<Product> findAll();

    void save(Product product);

    Product findProductById(Long id);

    void deleteProductById(Long id);
}
