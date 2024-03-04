package com.mock.main.project.mock.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    @NonNull
    private String customerName;
    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    Set<TradingName> tradingNames;


}
