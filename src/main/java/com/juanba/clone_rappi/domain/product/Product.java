package com.juanba.clone_rappi.domain.product;

import com.juanba.clone_rappi.app.dto.request.RegisterProductRequest;
import com.juanba.clone_rappi.domain.favorite.Favorite;
import com.juanba.clone_rappi.domain.vendor.Vendor;
import com.juanba.clone_rappi.infra.persistence.entity.ProductEntity;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String brand;
    private String name;
    private Category category;
    private String description;
    private BigDecimal price;
    private Long stock;
    private String image;
    private Integer promotion;
    private boolean isActive;
    private Long vendorId;
    private Long favorite;

    public Product(ProductEntity productSaved) {
        this.id = productSaved.getId();
        this.brand = productSaved.getBrand();
        this.category = productSaved.getCategory();
        this.description = productSaved.getDescription();
        this.price = productSaved.getPrice();
        this.stock = productSaved.getStock();
        this.image = productSaved.getImage();
        this.promotion = productSaved.getPromotion();
        this.isActive = productSaved.isActive();
        this.vendorId = productSaved.getVendorId().getId();
        this.favorite = productSaved.getFavorite().getId();
    }

    public Product(@Valid RegisterProductRequest registerRequest) {
        this(
                null,
                registerRequest.brand(),
                registerRequest.name(),
                registerRequest.category(),
                registerRequest.description(),
                registerRequest.price(),
                registerRequest.stock(),
                registerRequest.image(),
                registerRequest.promotion(),
                true,
                registerRequest.vendorId(),
                null
        );
    }
}
