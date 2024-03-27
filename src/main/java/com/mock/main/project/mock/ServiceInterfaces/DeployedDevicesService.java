package com.mock.main.project.mock.ServiceInterfaces;

import com.mock.main.project.mock.Entites.DeployedDevices;
import com.mock.main.project.mock.Entites.Device;
import com.mock.main.project.mock.Entites.Installations;

import java.util.List;

public interface DeployedDevicesService {

   DeployedDevices deployDevice(Device deviceId, Installations installationId);

}
