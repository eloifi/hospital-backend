package com.model.medecine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.model.acceuil.Service;

@Entity
@Table(name = "DOCTOR")
public class Doctor implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_DOCTOR")
    private Long id; // Identifiant client (Clé primaire).

    private String username;

    private String ref;

    private String nom;

    private String prenom;

    private Date birthday;

    private String sexe;

    private String telephone;

    private String cin;

    @ManyToOne()
    private Service service;

    public Doctor()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public Doctor(String username, String ref, String nom, String prenom, Date birthday, String sexe, String telephone,
        String cin, Service service)
    {
        super();
        this.username = username;
        this.ref = ref;
        this.nom = nom;
        this.prenom = prenom;
        this.birthday = birthday;
        this.sexe = sexe;
        this.telephone = telephone;
        this.cin = cin;
        this.service = service;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getRef()
    {
        return ref;
    }

    public void setRef(String ref)
    {
        this.ref = ref;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getSexe()
    {
        return sexe;
    }

    public void setSexe(String sexe)
    {
        this.sexe = sexe;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getCin()
    {
        return cin;
    }

    public void setCin(String cin)
    {
        this.cin = cin;
    }

    public Service getService()
    {
        return service;
    }

    public void setService(Service service)
    {
        this.service = service;
    }

}
