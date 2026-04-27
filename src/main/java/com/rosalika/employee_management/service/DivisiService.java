package com.rosalika.employee_management.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.rosalika.employee_management.entity.Divisi;
import com.rosalika.employee_management.repository.DivisiRepository;

@Service
public class DivisiService {

    private final DivisiRepository divisiRepository;

    public DivisiService(DivisiRepository divisiRepository) {
        this.divisiRepository = divisiRepository;
    }

    public List<Divisi> getAllDivisi() {
        return divisiRepository.findAll();
    }

    public Divisi saveDivisi(Divisi divisi) {
        return divisiRepository.save(divisi);
    }
}