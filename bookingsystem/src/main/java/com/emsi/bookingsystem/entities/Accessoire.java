package com.emsi.bookingsystem.entities;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Accessoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name="nom")
    public String nom;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="chambre")
    public Chambre chambre;
}
