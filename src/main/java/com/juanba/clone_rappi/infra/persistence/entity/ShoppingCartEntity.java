package com.juanba.clone_rappi.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_shopping_cart")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class ShoppingCartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "cart_owner")
    @OneToOne(targetEntity = UserEntity.class)
    private UserEntity owner;

    @OneToMany(targetEntity = ProductEntity.class, fetch = FetchType.LAZY, mappedBy = "shoppingCart")
    private List<ProductEntity> products;
}
