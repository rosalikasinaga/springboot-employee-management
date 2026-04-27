package com.rosalika.employee_management.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.rosalika.employee_management.entity.Divisi;
import com.rosalika.employee_management.service.DivisiService;
import com.rosalika.employee_management.repository.DivisiRepository;

import java.util.List;

@RestController
@RequestMapping("/divisi")
@RequiredArgsConstructor
public class DivisiController {

    private final DivisiRepository divisiRepository;

    @PostMapping
    public Divisi tambahDivisi(@RequestBody Divisi divisi) {
        return divisiRepository.save(divisi);
    }

    @GetMapping
    public List<Divisi> getAll() {
        return divisiRepository.findAll();
    }
}
