package com.model.acceuil;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIT")
public class Lit implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CHAMBRE")
    private Long id; // Identifiant chambre (Clé primaire).

    @Column(name = "NUMERO", unique = true)
    private String num;

    private String type;

    private Float prix;

    private int occupee;

    private int reservee;

    private String emplacement;

    private String photo;

    private Hospital hospital;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNum()
    {
        return num;
    }

    public void setNum(String num)
    {
        this.num = num;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Float getPrix()
    {
        return prix;
    }

    public void setPrix(Float prix)
    {
        this.prix = prix;
    }

    public int getOccupee()
    {
        return occupee;
    }

    public void setOccupee(int occupee)
    {
        this.occupee = occupee;
    }

    public int getReservee()
    {
        return reservee;
    }

    public void setReservee(int reservee)
    {
        this.reservee = reservee;
    }

    public String getEmplacement()
    {
        return emplacement;
    }

    public void setEmplacement(String emplacement)
    {
        this.emplacement = emplacement;
    }

    public String getPhoto()
    {
        return photo;
    }

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    public Hospital getHospital()
    {
        return hospital;
    }

    public void setHospital(Hospital hospital)
    {
        this.hospital = hospital;
    }

}
