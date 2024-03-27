package com.mock.main.project.mock.API;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Pojo.CustomerPojo;
import com.mock.main.project.mock.ServiceInterfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/customer")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){

        return new ResponseEntity<>( customerService.getAllCustomers(),HttpStatus.OK);
    }

    @PostMapping("/addNewCustomer")
    public ResponseEntity<Customer> addNewCustomer (@RequestBody CustomerPojo CustomerPojo){

        return new ResponseEntity<>(customerService.saveCustomer(CustomerPojo), HttpStatus.CREATED);
    }

    @PutMapping("/updateCustomer")
    public ResponseEntity<Customer> updateCustomer (@RequestBody CustomerPojo CustomerPojo){

        return new ResponseEntity<>(customerService.saveCustomer(CustomerPojo), HttpStatus.CREATED);
    }
 }
