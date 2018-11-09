package com.model.medecine;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.model.acceuil.Hospitalisation;

@Entity
@Table(name = "PATIENT")
public class Patient implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_HOTE")
    private Long id; // Identifiant client (Clé primaire).

    private String ref;

    private String username;

    private String nom;

    private String prenom;

    private Date birthday;

    private String sexe;

    private String telephone;

    private String passeport;

    private String cin;

    @OneToMany(fetch = FetchType.EAGER)
    List<Hospitalisation> Hospitalisation;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getRef()
    {
        return ref;
    }

    public void setRef(String ref)
    {
        this.ref = ref;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
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

    public String getPasseport()
    {
        return passeport;
    }

    public void setPasseport(String passeport)
    {
        this.passeport = passeport;
    }

    public String getCin()
    {
        return cin;
    }

    public void setCin(String cin)
    {
        this.cin = cin;
    }

    public List<Hospitalisation> getHospitalisation()
    {
        return Hospitalisation;
    }

    public void setHospitalisation(List<Hospitalisation> hospitalisation)
    {
        Hospitalisation = hospitalisation;
    }

}
