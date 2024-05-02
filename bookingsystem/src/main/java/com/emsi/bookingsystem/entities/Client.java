package com.emsi.bookingsystem.entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name="nom")
    public String nom;
    @Column(name="prenom")
    public String prenom;
    @Column(name="telephone")
    public String telephone;
    @Column(name="email")
    public String email;
    @Column(name="password")
    public String password;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    public List<Reservation> Reservations =new ArrayList<>();
}
