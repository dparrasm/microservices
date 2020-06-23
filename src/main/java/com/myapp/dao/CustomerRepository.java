package com.myapp.dao;

import com.myapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "customers")
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
