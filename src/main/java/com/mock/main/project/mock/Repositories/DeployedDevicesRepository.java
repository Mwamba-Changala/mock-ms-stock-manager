package com.mock.main.project.mock.Repositories;

import com.mock.main.project.mock.Entites.DeployedDevices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeployedDevicesRepository extends JpaRepository<DeployedDevices, Long> {

}
