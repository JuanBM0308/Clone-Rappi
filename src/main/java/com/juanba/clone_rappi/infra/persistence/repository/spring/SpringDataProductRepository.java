package com.juanba.clone_rappi.infra.persistence.repository.spring;

import com.juanba.clone_rappi.infra.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataProductRepository extends JpaRepository<ProductEntity, Long> {
}
