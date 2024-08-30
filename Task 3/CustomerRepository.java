package com.example.Customer.Repository;

import com.example.Customer.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom queries can be added here if needed
}
