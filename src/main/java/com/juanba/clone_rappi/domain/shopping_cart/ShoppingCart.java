package com.juanba.clone_rappi.domain.shopping_cart;

import com.juanba.clone_rappi.domain.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {
    private Long id;
    private String user;
    private List<Product> products;
}
