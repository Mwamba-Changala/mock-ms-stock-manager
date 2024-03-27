package com.mock.main.project.mock.Pojo;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SimCardPojo {


    String serviceProviderName;

    Long simCardSerialNumber;

    String ipAddress;
}
