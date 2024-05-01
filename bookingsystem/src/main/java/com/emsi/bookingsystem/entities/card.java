package com.emsi.bookingsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CARD")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class card extends Paiment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
