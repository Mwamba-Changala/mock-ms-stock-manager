package com.mock.main.project.mock.Pojo;

import com.mock.main.project.mock.Pojo.CustomerPojo;
import lombok.*;

import java.util.List;

@Data
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class TradingNamePojo {

    private Long tradingNameId;
    @NonNull
    private String tradingName;

    List<CustomerPojo> customerPojo;
}
