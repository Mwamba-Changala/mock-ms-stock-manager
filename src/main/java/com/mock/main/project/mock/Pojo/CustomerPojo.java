package com.mock.main.project.mock.Pojo;

import lombok.*;

import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerPojo {
    private Long customerId;
    @NonNull
    private String customerName;
    List<TradingNamePojo> tradingNames;



}
