package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.acceuil.Patient;

public interface PatientDao extends JpaRepository<Patient, Long>
{
    List<Patient> findByUsername(String username);

}
