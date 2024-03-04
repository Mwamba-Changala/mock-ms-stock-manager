package com.mock.main.project.mock.Pojo;

import com.mock.main.project.mock.Entites.Customer;
import com.mock.main.project.mock.Entites.Device;
import com.mock.main.project.mock.Entites.Installations;
import com.mock.main.project.mock.Entites.TradingName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DeployedDevices {

    private Long id;
    private List<Installations> installations;
    private List<Device> devices;
}
