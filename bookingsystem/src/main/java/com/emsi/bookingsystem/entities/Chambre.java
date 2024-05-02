package com.emsi.bookingsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import com.emsi.bookingsystem.enums.ChambreEtat;
import lombok.Data;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Chambre{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name="numc")
    public String numc;
    @Column(name="prix")
    public double prix;
    @Column(name="etage")
    public String etage;
    @Column(name="description")
    public String description;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="image")
    public File image;
    @Enumerated(EnumType.STRING)
    @Column(name="Chambreetat")
    public ChambreEtat chambreEtat;
    @OneToMany(mappedBy = "chambre",fetch = FetchType.LAZY)
    public List<Reservation> Reservations =new ArrayList<>();
    @OneToMany(mappedBy = "chambre",fetch = FetchType.LAZY)
    public List<Accessoire> accessoires =new ArrayList<>();
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="hotel")
    public Hotel hotel;
    @ManyToOne
    private Receptioniste recep;
}

