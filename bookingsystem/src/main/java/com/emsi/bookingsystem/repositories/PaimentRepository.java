package com.emsi.bookingsystem.repositories;

import com.emsi.bookingsystem.entities.Paiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaimentRepository extends JpaRepository<Paiment, Long>{
}
