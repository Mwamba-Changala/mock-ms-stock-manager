package com.mock.main.project.mock.Pojo;

import com.mock.main.project.mock.Entites.TradingName;
import lombok.*;

import java.util.List;

@Data
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class OutletPojo {

    private Long id;

    @NonNull
    private Long OutletNumber;
    @NonNull
    private  String outletLocation;

    private List<TradingNamePojo> tradingNames;

}
