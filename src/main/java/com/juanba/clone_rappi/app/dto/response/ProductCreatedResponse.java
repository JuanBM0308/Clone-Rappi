package com.juanba.clone_rappi.app.dto.response;

import com.juanba.clone_rappi.domain.product.Category;
import com.juanba.clone_rappi.domain.product.Product;

import java.math.BigDecimal;

public record ProductCreatedResponse(
        Long id,
        String name,
        String brand,
        Category category,
        BigDecimal price,
        String image
) {
    public ProductCreatedResponse(Product productSaved) {
        this(
                productSaved.getId(),
                productSaved.getName(),
                productSaved.getBrand(),
                productSaved.getCategory(),
                productSaved.getPrice(),
                productSaved.getImage()
        );
    }
}
