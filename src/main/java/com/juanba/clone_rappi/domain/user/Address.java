package com.juanba.clone_rappi.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String street;
    private String streetNumber;
    private String neighborhood;
    private String city;
    private String stateProvince;
    private String postalCode;
    private String additionalReferences;
}
