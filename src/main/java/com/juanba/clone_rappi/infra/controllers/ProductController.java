package com.juanba.clone_rappi.infra.controllers;

import com.juanba.clone_rappi.app.dto.request.RegisterProductRequest;
import com.juanba.clone_rappi.app.dto.response.ProductCreatedResponse;
import com.juanba.clone_rappi.app.port.in.CreateProductUseCase;
import com.juanba.clone_rappi.domain.product.Product;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/rappi/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final CreateProductUseCase createProductUseCase;

    @Transactional
    @PostMapping
    public ResponseEntity<ProductCreatedResponse> createProduct(@RequestBody @Valid RegisterProductRequest registerRequest, UriComponentsBuilder uriComponentsBuilder) {
        final Product product = new Product(registerRequest);
        final Product productSaved = createProductUseCase.createProduct(product);

        var uri = uriComponentsBuilder.path("/{id}").buildAndExpand(productSaved.getId()).toUri();

        return ResponseEntity.created(uri).body(new ProductCreatedResponse(productSaved));
    }
}
