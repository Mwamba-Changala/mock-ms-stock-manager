package com.mock.main.project.mock.Repositories;

import com.mock.main.project.mock.Entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
