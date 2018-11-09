package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.medecine.Doctor;

public interface DoctorDao extends JpaRepository<Doctor, Long>
{
    List<Doctor> findByUsername(String username);
}
