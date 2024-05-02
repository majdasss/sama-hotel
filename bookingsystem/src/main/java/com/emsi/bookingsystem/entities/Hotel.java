package com.emsi.bookingsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name="nom")
    public String nom;
    @Column(name="nbrchambres")
    public Long nbrChambres;
    @Column(name="telephone")
    public String telephone;
    @Column(name="adresse")
    public String adresse;
    @OneToMany(mappedBy = "hotel",fetch = FetchType.EAGER)
    public List<Chambre> Chambres =new ArrayList<>();

}


