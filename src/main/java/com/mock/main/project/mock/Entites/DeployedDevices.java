package com.mock.main.project.mock.Entites;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class DeployedDevices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NonNull
    @OneToOne
    @JoinColumn(name = "installation_id_fk", referencedColumnName = "installation_id")
    private Installations installationId;

    @NonNull
    @OneToOne
    @JoinColumn(name = "device_id_fk", referencedColumnName = "device_id")
    private Device deviceId;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

}
