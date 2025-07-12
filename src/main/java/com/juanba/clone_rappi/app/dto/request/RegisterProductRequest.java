package com.juanba.clone_rappi.app.dto.request;

import com.juanba.clone_rappi.domain.product.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record RegisterProductRequest(

        @NotBlank(message = "Name is mandatory")
        String name,
        String brand,
        @NotNull
        Category category,
        String description,
        @NotNull
        BigDecimal price,
        Long stock,
        @NotBlank(message = "Image is necessary")
        String image,
        Integer promotion,
        @NotNull
        Long vendorId

) {
}
