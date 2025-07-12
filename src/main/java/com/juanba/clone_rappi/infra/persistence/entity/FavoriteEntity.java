package com.juanba.clone_rappi.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_favorite")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class FavoriteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(targetEntity = UserEntity.class)
    private UserEntity user;

    @OneToMany(targetEntity = ProductEntity.class, fetch = FetchType.LAZY, mappedBy = "favorite")
    private List<ProductEntity> product;
}
