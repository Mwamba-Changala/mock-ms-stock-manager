package com.mock.main.project.mock.Pojo;

import com.mock.main.project.mock.Enums.DeviceStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class DevicePojo {

    Long deviceSerialNumber;
    String assetTag;
    DeviceStatus deviceStatus;

}
