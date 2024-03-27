package com.mock.main.project.mock.API;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Pojo.CustomerPojo;
import com.mock.main.project.mock.Entites.TradingName;
import com.mock.main.project.mock.Pojo.TradingNamePojo;
import com.mock.main.project.mock.ServiceInterfaces.TradingNameService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/Trading")
public class TradingNameController {

    @Autowired
    TradingNameService tradingNameService;
    @GetMapping
    @Operation(summary = "Get all TradingNames")
    public ResponseEntity<?> getAllTradingNames(){

        return new ResponseEntity<>( tradingNameService.getAllTradingNames(), HttpStatus.OK);
    }

    @PostMapping("/addNewTradingNameToExistingCustomer")
    public ResponseEntity<TradingName> addNewCustomer (@RequestBody TradingNamePojo tradingNamePojo){

        return new ResponseEntity<>(tradingNameService.saveTradingName(tradingNamePojo, null) , HttpStatus.CREATED);
    }

    @PutMapping("/updateCustomer")
    public ResponseEntity<Customer> updateCustomer (@RequestBody CustomerPojo CustomerPojo){

        return new ResponseEntity<>( HttpStatus.OK);
    }

    @GetMapping("/fetchByCustomerId/{customerId}")
    @Operation(summary = "Get trading name by customer id")
    public ResponseEntity<List<TradingName>> getByCustomerId (@PathVariable Long customerId){

        return new ResponseEntity<>( tradingNameService.findCustomerById(customerId), HttpStatus.OK);
    }
}
