package com.mock.main.project.mock.ServiceInterfaces;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Entites.Installations;
import com.mock.main.project.mock.Entites.Terminal;
import com.mock.main.project.mock.Entites.TradingName;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface InstallationService {

    List<Installations> fetchAllInstallations();

    Installations saveInstallation(Customer customer, TradingName tradingName, Terminal terminal);
    List<Installations> findInstallationByCustomerAndTradingNameId(Long customerId, Long tradingNameId);

    Installations updateInstallationStatus(Long installationId);
    Map<String, Integer> getInstallationStatsMonthOnMonth();


}
