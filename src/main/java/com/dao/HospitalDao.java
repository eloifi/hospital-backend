package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.acceuil.Hospital;

public interface HospitalDao extends JpaRepository<Hospital, Long>
{
}
