package com.juanba.clone_rappi.domain.favorite;

import com.juanba.clone_rappi.domain.product.Product;
import com.juanba.clone_rappi.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Favorite {
    private Long id;
    private User user;
    private List<Product> product;
}
