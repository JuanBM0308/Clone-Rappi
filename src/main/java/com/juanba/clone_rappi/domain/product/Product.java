package com.juanba.clone_rappi.domain.product;

import com.juanba.clone_rappi.domain.user.User;
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
    private User vendorId;
}
