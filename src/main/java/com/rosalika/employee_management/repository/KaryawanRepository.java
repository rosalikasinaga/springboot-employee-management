package com.rosalika.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rosalika.employee_management.entity.Karyawan;

public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {
}