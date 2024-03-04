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
public class Terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "terminal_id")
    private Long id;

    @NonNull
    private Long terminalNumber;

    @ManyToOne(optional = false)
    @JoinColumn(name = "outlet_id_fk", referencedColumnName = "outlet_id")
    private Outlet outlets;


}
