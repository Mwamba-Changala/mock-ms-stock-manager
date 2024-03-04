package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Entites.Outlet;
import com.mock.main.project.mock.Entites.TradingName;
import com.mock.main.project.mock.Pojo.OutletPojo;

import java.util.List;

public interface OutletService {

    List<Outlet> getAllOutlets();

    Outlet saveOutlet(OutletPojo outletPojo, TradingName tradingName);

}
