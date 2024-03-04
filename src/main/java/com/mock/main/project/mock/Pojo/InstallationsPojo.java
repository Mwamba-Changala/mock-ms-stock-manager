package com.mock.main.project.mock.Pojo;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Entites.TradingName;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InstallationsPojo {


    private Long id;
    private List<Customer> customer;
    private Boolean status ;
    private List<TradingName> tradingName;
}
