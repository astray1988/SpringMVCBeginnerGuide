package com.packt.webstore.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Customer {
    private String customerId;
    private String name;
    private String address;
    private int noOfOrdersMade;
}
