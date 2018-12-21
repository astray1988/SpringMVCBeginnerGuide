package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = Customer.builder()
                .customerId("20191001")
                .address("342 Market St, apt 234, Philadelphia, PA, 19131")
                .name("Jimmy")
                .noOfOrdersMade(34)
                .build();
        Customer customer2 = Customer.builder()
                .customerId("20191002")
                .address("243 Great Ave, Maryland, MD, 21224")
                .name("Landen")
                .noOfOrdersMade(254)
                .build();
        customerList.add(customer1);
        customerList.add(customer2);

        return customerList;
    }
}
