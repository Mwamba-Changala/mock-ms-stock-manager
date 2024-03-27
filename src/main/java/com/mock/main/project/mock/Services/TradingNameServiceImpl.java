package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Entites.TradingName;
import com.mock.main.project.mock.Pojo.TradingNamePojo;
import com.mock.main.project.mock.Repositories.TradingNameRepository;
import com.mock.main.project.mock.ServiceInterfaces.TradingNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradingNameServiceImpl implements TradingNameService {

    @Autowired
    TradingNameRepository tradingNameRepository;

    @Override
    public List<TradingName> getAllTradingNames() {
        return tradingNameRepository.findAll();
    }

    @Override
    public TradingName saveTradingName(TradingNamePojo tradingNamePojo, Customer customer) {

        TradingName tradingName = new TradingName();
        tradingName.setTradingName(tradingNamePojo.getTradingName());
        tradingName.setCustomer(customer);
        return tradingNameRepository.save(tradingName);
    }

        @Override
        public List<TradingName> findCustomerById(Long customerId){

            return tradingNameRepository.findByCustomerId(customerId);

        }
}
