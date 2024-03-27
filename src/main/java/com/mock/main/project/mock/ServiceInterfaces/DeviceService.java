package com.mock.main.project.mock.ServiceInterfaces;

import com.mock.main.project.mock.Entites.Device;
import com.mock.main.project.mock.Pojo.DevicePojo;

public interface DeviceService {

    Device saveDevice(DevicePojo devicePojo);

    Device findById(Long deviceId);
}
