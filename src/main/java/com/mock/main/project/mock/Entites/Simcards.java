package com.mock.main.project.mock.Entites;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Simcards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "simcard_id")
    Long id;
    @NonNull
    String serviceProviderName;
    @NonNull
    Long simCardSerialNumber;
    @NonNull
    String ipAddress;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

}
