package com.juanba.clone_rappi.domain.vendor;

import com.juanba.clone_rappi.domain.product.Product;
import com.juanba.clone_rappi.domain.user.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
    private Long id;
    private String name;
    private Address address;
    private String nit;
    private String email;
    private String phoneNumber;
    private List<Product> products;
}
