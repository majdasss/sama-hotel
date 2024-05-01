package com.emsi.bookingsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CASH")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class cash extends Paiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
