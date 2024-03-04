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
public class TradingName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trading_name_id")
    private Long id;
    @NonNull
    private String TradingName;
    @ManyToOne
    @JoinColumn(name = "customer_id_fk", referencedColumnName = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "tradingName")
    @JsonIgnore
    Set<Outlet> outlets;

//    @OneToMany(mappedBy = "tradingName")
//    @JsonIgnore
//    Set<Installations> installations;
}
