package com.emsi.bookingsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Receptioniste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name="email")
    public String email;
    @Column(name="password")
    public String password;
    @OneToMany(mappedBy = "recep", fetch = FetchType.LAZY)
    private List<Chambre> chambres = new ArrayList<>();
}
