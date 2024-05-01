package com.emsi.bookingsystem.services;

import com.emsi.bookingsystem.entities.Paiment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Paimentservice {
        Paiment savePaiment (Paiment paiment);
    Paiment updatePaiment (Paiment paiment);
        void deletePaimentById(Long id);
        void deleteAllPaiments();
    Paiment getPaimentById(Long id);
        List<Paiment> getAllPaiments();
}
