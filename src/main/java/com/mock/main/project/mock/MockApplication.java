package com.mock.main.project.mock;

import com.mock.main.project.mock.Entites.*;
import com.mock.main.project.mock.Enums.DeviceStatus;
import com.mock.main.project.mock.Pojo.*;
import com.mock.main.project.mock.Repositories.DeviceRepository;
import com.mock.main.project.mock.Repositories.OutletRepository;
import com.mock.main.project.mock.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MockApplication  implements CommandLineRunner {

	@Autowired
	CustomerService customerService;
	@Autowired
	TradingNameService tradingNameService;

	@Autowired
	OutletService outletService;
	@Autowired
	TerminalService terminalService;
	@Autowired
	InstallationService installationService;
	@Autowired
	private DeviceService deviceService;

	public static void main(String[] args) {
		SpringApplication.run(MockApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CustomerPojo[] customerPojo = new CustomerPojo[]{
		new CustomerPojo("Ms South"),
				new CustomerPojo("Ms North"),
		};

		TradingNamePojo[] tradingNamePojo = new TradingNamePojo[]{
				new TradingNamePojo("Chip and pin South"),
				new TradingNamePojo("Chip and pin North"),
		};

		OutletPojo[] outletPojo = new OutletPojo[]{
				new OutletPojo(123456L,"Tech Room LSk"),
				new OutletPojo(654321L,"Tech Room Kitwe"),
		};

		TerminalPojo[] terminalPojo = new TerminalPojo[]{
				new TerminalPojo(306906L),
				new TerminalPojo(906306L),
		};

		DevicePojo[] devicePojo = new DevicePojo[]{
				new DevicePojo(1851208899L, "FNBZ3899" ,DeviceStatus.WORKING),
				new DevicePojo(1851209988L,"FNBZ3891" ,DeviceStatus.WORKING),
		};

		for (int i= 0; i < customerPojo.length; i++){

			Customer customer = customerService.saveCustomer(customerPojo[i]);

		 	TradingName tradingName = tradingNameService.saveTradingName(tradingNamePojo[i], customer );

			Outlet outlet = outletService.saveOutlet(outletPojo[i], tradingName);

			Terminal terminal = terminalService.saveTerminal(terminalPojo[i], outlet);

			deviceService.saveDevice(devicePojo[i]);

			installationService.saveInstallation(customer,tradingName,terminal);


		}


	}
}
