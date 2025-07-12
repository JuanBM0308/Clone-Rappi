package com.juanba.clone_rappi.app.service;

import com.juanba.clone_rappi.app.port.in.CreateProductUseCase;
import com.juanba.clone_rappi.app.port.out.ProductRepositoryOut;
import com.juanba.clone_rappi.domain.product.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements CreateProductUseCase {

    private final ProductRepositoryOut productRepositoryOut;

    public ProductService(ProductRepositoryOut productRepositoryOut) {
        this.productRepositoryOut = productRepositoryOut;
    }


    @Override
    public Product createProduct(Product product) {
        return productRepositoryOut.save(product);
    }
}
