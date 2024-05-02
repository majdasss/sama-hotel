package com.emsi.bookingsystem.entities;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name="email")
    public String email;
    @Column(name="password")
    public String password;
}
