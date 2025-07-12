package com.juanba.clone_rappi.infra.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.juanba.clone_rappi.domain.user.Address;
import com.juanba.clone_rappi.domain.vendor.Vendor;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_vendor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class VendorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Address address;
    private String nit;

    @Email
    @Column(unique = true)
    private String email;

    private String phoneNumber;

    @JsonIgnore
    @OneToMany(targetEntity = ProductEntity.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ProductEntity> products;

    public VendorEntity(Vendor vendor) {
        this.id = vendor.getId();
        this.name = vendor.getName();
        this.address = vendor.getAddress();
        this.nit = vendor.getNit();
        this.email = vendor.getEmail();
        this.phoneNumber = vendor.getPhoneNumber();
        if (vendor.getProducts() != null) {
            this.products = vendor.getProducts().stream()
                    .map(productDomain -> {
                        ProductEntity productEntity = new ProductEntity(productDomain);
                        productEntity.setVendorId(this);
                        return productEntity;
                    })
                    .toList();
        }
    }
}
