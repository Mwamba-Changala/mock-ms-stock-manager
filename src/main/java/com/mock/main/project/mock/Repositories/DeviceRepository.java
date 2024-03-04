package com.mock.main.project.mock.Repositories;

import com.mock.main.project.mock.Entites.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {


}
