package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.DeployedDevices;
import com.mock.main.project.mock.Entites.Device;
import com.mock.main.project.mock.Entites.Installations;
import com.mock.main.project.mock.Repositories.DeployedDevicesRepository;
import com.mock.main.project.mock.ServiceInterfaces.DeployedDevicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeployedDevicesServiceImpl implements DeployedDevicesService {

    @Autowired
    DeployedDevicesRepository deployedDevicesRepository;
    @Override
    public DeployedDevices deployDevice(Device deviceId, Installations installationId) {

        DeployedDevices deployedDevices = new DeployedDevices();
        deployedDevices.setDeviceId(deviceId);
        deployedDevices.setInstallationId(installationId);

        return deployedDevicesRepository.save(deployedDevices);
    }
}
