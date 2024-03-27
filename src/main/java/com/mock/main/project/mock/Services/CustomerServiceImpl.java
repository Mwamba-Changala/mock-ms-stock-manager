package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Pojo.CustomerPojo;
import com.mock.main.project.mock.Repositories.CustomerRepository;
import com.mock.main.project.mock.ServiceInterfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
@Autowired
    CustomerRepository customerRepository;
@Override
    public List<Customer> getAllCustomers(){

        return customerRepository.findAll();

}

    @Override
    public Customer saveCustomer(CustomerPojo customerPojo) {

        Customer customer = new Customer();
        customer.setCustomerName(customerPojo.getCustomerName());
        return customerRepository.save(customer);
    }
}
