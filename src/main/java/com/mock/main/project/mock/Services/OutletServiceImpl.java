package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Outlet;
import com.mock.main.project.mock.Entites.TradingName;
import com.mock.main.project.mock.Pojo.OutletPojo;
import com.mock.main.project.mock.Repositories.OutletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutletServiceImpl implements OutletService{

    @Autowired
    OutletRepository outletRepository;

    @Override
    public List<Outlet> getAllOutlets() {
        return outletRepository.findAll();
    }

    @Override
    public Outlet saveOutlet(OutletPojo outletPojo, TradingName tradingName) {

        Outlet outlet = new Outlet();
        outlet.setOutletNumber(outletPojo.getOutletNumber());
        outlet.setOutLetLocation(outletPojo.getOutletLocation());
        outlet.setTradingName(tradingName);

        return outletRepository.save(outlet);
    }
}
