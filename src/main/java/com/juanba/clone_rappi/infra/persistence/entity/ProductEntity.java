package com.juanba.clone_rappi.infra.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.juanba.clone_rappi.domain.favorite.Favorite;
import com.juanba.clone_rappi.domain.product.Category;
import com.juanba.clone_rappi.domain.product.Product;
import com.juanba.clone_rappi.domain.vendor.Vendor;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String description;
    private BigDecimal price;
    private Long stock;
    private String image;
    private Integer promotion;
    private boolean isActive;

    @ManyToOne(targetEntity = VendorEntity.class, fetch = FetchType.EAGER)
    private VendorEntity vendorId;

    // ! Relation ShoppingCartEntity
    @JsonIgnore
    @ManyToOne(targetEntity = ShoppingCartEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private ShoppingCartEntity shoppingCart;

    // ! Relation FavoriteEntity
    @JsonIgnore
    @ManyToOne(targetEntity = FavoriteEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private FavoriteEntity favorite;

    public ProductEntity(Product product) {
        this.id = product.getId();
        this.brand = product.getBrand();
        this.name = product.getName();
        this.category = product.getCategory();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.stock = product.getStock();
        this.image = product.getImage();
        this.promotion = product.getPromotion();
        this.isActive = product.isActive();
    }
}
