package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.*;
import com.mock.main.project.mock.Enums.InstallationStatus;
import com.mock.main.project.mock.Exception.InstallationNotFoundException;
import com.mock.main.project.mock.Pojo.DateAnalyzer;
import com.mock.main.project.mock.Repositories.InstallationsRepository;
import com.mock.main.project.mock.ServiceInterfaces.DeployedDevicesService;
import com.mock.main.project.mock.ServiceInterfaces.DeviceService;
import com.mock.main.project.mock.ServiceInterfaces.InstallationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class InstallationServiceImpl implements InstallationService {

    @Autowired
    InstallationsRepository installationsRepository;

    @Autowired
    DeployedDevicesService deployedDevicesService;

    @Autowired
    DeviceService deviceService;

    @Override
    public List<Installations> findInstallationByCustomerAndTradingNameId(Long customerId, Long tradingNameId) {
        return null;
    }

    @Override
    public List<Installations> fetchAllInstallations() {
        return installationsRepository.findAll();
    }

    @Override
    public Installations saveInstallation(Customer customer, TradingName tradingName, Terminal terminal) {

        Installations installations = new Installations();
//        installations.setCustomer(customer);
//        installations.setTradingName(tradingName);


        installations.setInstallationStatus(InstallationStatus.PENDING);
        installations.setTerminals(terminal);

        return installationsRepository.save(installations);
    }

    @Override
    public Installations updateInstallationStatus(Long installationId) {

        Installations updateInstallationStatus = installationsRepository.findById(installationId)
                .orElseThrow(()-> new InstallationNotFoundException("Installation call not found"));

System.out.println(updateInstallationStatus.getInstallationStatus().toString());
            if (updateInstallationStatus.getInstallationStatus() == InstallationStatus.PENDING) {
//        check status of enum before updating
                deployedDevicesService.deployDevice( deviceService.findById(1L) ,updateInstallationStatus);
                updateInstallationStatus.setInstallationStatus(InstallationStatus.INSTALLED);

                return installationsRepository.save(updateInstallationStatus);

            }

        return null;
    }

    @Override
    public Map<String, Integer> getInstallationStatsMonthOnMonth() {

         List<Installations> installations = installationsRepository.findAll();

        DateAnalyzer dateAnalyzer = new DateAnalyzer();
        try {
           return dateAnalyzer.theDate(installations);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }



    }

    static Installations unwrapInstallation(Optional<Installations> entity) {

        if (entity.isPresent()) return entity.get();
        else return null;

    }


}
