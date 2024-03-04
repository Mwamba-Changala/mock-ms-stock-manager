package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Entites.TradingName;
import com.mock.main.project.mock.Pojo.TradingNamePojo;

import java.util.List;

public interface TradingNameService {

    List<TradingName> getAllTradingNames();
    TradingName saveTradingName(TradingNamePojo tradingNamePojo, Customer customer);

    List<TradingName> findCustomerById(Long customerId);
}
