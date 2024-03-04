package com.mock.main.project.mock.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mock.main.project.mock.Enums.InstallationStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.Set;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Installations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "installation_id")
    private Long id;


//    @ManyToOne
//    @JoinColumn(name = "customer_id_fk", referencedColumnName = "customer_id")
//    private Customer customer;

//    @ManyToOne
//    @JoinColumn(name = "trading_id_fk", referencedColumnName = "trading_name_id")
//    private TradingName tradingName;

    @OneToOne
    @JoinColumn(name = "terminal_id_fk", referencedColumnName = "terminal_id")
    private Terminal terminals;

    @Enumerated(EnumType.STRING)
    private InstallationStatus installationStatus;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

}
