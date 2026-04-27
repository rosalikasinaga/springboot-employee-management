package com.rosalika.employee_management.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Karyawan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nama;
    private String email;

    @ManyToOne
    @JoinColumn(name = "divisi_id")
    private com.rosalika.employee_management.entity.Divisi divisi;
}