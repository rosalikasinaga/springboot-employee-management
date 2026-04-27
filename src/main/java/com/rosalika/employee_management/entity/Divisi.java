package com.rosalika.employee_management.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Divisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namaDivisi;

    @OneToMany(mappedBy = "divisi")
    private List<Karyawan> karyawanList;
}