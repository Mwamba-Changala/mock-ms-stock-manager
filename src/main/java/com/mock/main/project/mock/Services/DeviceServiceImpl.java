package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Device;
import com.mock.main.project.mock.Entites.Installations;
import com.mock.main.project.mock.Exception.InstallationNotFoundException;
import com.mock.main.project.mock.Pojo.DevicePojo;
import com.mock.main.project.mock.Repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeviceServiceImpl implements DeviceService{

    @Autowired
    DeviceRepository deviceRepository;
    @Override
    public Device saveDevice(DevicePojo devicePojo) {

        Device device = new Device();
        device.setDeviceSerialNumber(devicePojo.getDeviceSerialNumber());
        device.setAssetTag(devicePojo.getAssetTag());
        device.setDeviceStatus(devicePojo.getDeviceStatus());

        return deviceRepository.save(device);
    }

    @Override
    public Device findById(Long deviceId) {

        return unwrapDevice(deviceRepository.findById(deviceId));

    }

    static Device unwrapDevice(Optional<Device> entity) {

        if (entity.isPresent()) return entity.get();
        else throw new InstallationNotFoundException();

    }
}
