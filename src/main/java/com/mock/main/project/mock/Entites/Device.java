package com.mock.main.project.mock.Entites;

import com.mock.main.project.mock.Enums.DeviceStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id")
    Long id;

    @NonNull
    Long deviceSerialNumber;
    @NonNull
    String assetTag;

    @NonNull
    @Enumerated(EnumType.STRING)
    DeviceStatus deviceStatus;
}
