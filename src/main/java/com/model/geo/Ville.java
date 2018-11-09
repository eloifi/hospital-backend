package com.model.geo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ----------- Hotels ----------
 * 
 * @author m.eloifi@outlook.com
 * @version 0.0.1
 * @since 09/2017
 */
@Entity
@Table(name = "VILLE")
public class Ville implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_VILLE")
    private Long id; // Identifiant client ou fournisseur (Clé primaire).

    @Column(name = "NOM", unique = true)
    private String nom;

    public Ville(String nom)
    {
        super();
        this.nom = nom;
    }

    public Ville()
    {
        super();
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

}
