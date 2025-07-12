package com.juanba.clone_rappi.app.port.in;

import com.juanba.clone_rappi.domain.product.Product;

public interface CreateProductUseCase {
    Product createProduct(Product product);
}
