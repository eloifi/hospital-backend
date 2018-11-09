package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.geo.Ville;

public interface VilleDao extends JpaRepository<Ville, Long>
{
    List<Ville> findByNom(String nom);
}
