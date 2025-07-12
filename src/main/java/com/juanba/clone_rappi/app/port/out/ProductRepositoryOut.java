package com.juanba.clone_rappi.app.port.out;

import com.juanba.clone_rappi.domain.product.Product;

public interface ProductRepositoryOut {
    Product save(Product product);
}
