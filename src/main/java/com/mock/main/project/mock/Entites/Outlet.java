package com.mock.main.project.mock.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class Outlet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "outlet_id")
    private Long id;

    @NonNull
    private Long outletNumber;
    @NonNull
    private String outLetLocation;

    @ManyToOne
    @JoinColumn(name = "tradingName_id_fk", referencedColumnName = "trading_name_id")
    private TradingName tradingName;

}
