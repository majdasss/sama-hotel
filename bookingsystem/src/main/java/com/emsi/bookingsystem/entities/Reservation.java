package com.emsi.bookingsystem.entities;
import com.emsi.bookingsystem.enums.ReservationEtat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name="jourarrivé")
    public Date jourarrive;
    @Column(name="jourdepart")
    public Date jourdepart;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="client")
    public Client client;
    @Enumerated(EnumType.STRING)
    @Column(name="reservationetat")
    public ReservationEtat reservationEtat;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="chambre")
    public Chambre chambre;
}
