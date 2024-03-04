package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Pojo.CustomerPojo;

import java.util.List;

public interface CustomerService {
    List<Customer>getAllCustomers();
    Customer saveCustomer(CustomerPojo customerPojo);

}
