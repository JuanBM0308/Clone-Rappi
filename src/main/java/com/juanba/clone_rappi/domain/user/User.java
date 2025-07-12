package com.juanba.clone_rappi.domain.user;

import com.juanba.clone_rappi.domain.favorite.Favorite;
import com.juanba.clone_rappi.domain.shopping_cart.ShoppingCart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String email;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private Address address;
    private String password;
    private Role role;
    private LocalDateTime registerDate;
    private boolean isActive;
    private ShoppingCart shoppingCart;
    private Favorite favorites;
}
