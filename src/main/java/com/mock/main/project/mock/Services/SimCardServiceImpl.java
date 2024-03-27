package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Simcards;
import com.mock.main.project.mock.Pojo.SimCardPojo;
import com.mock.main.project.mock.Repositories.SimCardsRepository;
import com.mock.main.project.mock.ServiceInterfaces.SimcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimCardServiceImpl implements SimcardService {

    @Autowired
    SimCardsRepository simCardsRepository;
    @Override
    public Simcards saveSimcards(SimCardPojo simCardPojo) {

        Simcards simcards = new Simcards();
        simcards.setServiceProviderName(simCardPojo.getServiceProviderName());
        simcards.setSimCardSerialNumber(simCardPojo.getSimCardSerialNumber());
        simcards.setIpAddress(simCardPojo.getIpAddress());

        return simCardsRepository.save(simcards);
    }
}
