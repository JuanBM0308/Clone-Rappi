package com.juanba.clone_rappi.infra.persistence.repository.jpa;

import com.juanba.clone_rappi.app.port.out.ProductRepositoryOut;
import com.juanba.clone_rappi.domain.product.Product;
import com.juanba.clone_rappi.infra.persistence.entity.ProductEntity;
import com.juanba.clone_rappi.infra.persistence.repository.spring.SpringDataProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JpaProductRepositoryAdapter implements ProductRepositoryOut {

    private final SpringDataProductRepository springDataProductRepository;

    public JpaProductRepositoryAdapter(SpringDataProductRepository springDataProductRepository) {
        this.springDataProductRepository = springDataProductRepository;
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = new ProductEntity(product);
        final var productSaved = springDataProductRepository.save(productEntity);
        return new Product(productSaved);
    }
}
