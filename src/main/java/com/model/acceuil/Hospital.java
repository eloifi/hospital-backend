package com.model.acceuil;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.model.geo.Ville;

@Entity
@Table(name = "HOSPITAL")
public class Hospital implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_HOSPITAL")
    private Long id; // Identifiant client ou fournisseur (Clé primaire).

    private String ref;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DESIGNATION")
    private String designation;

    @Column(name = "ADRESSE")
    private String adresse;

    @Column(name = "PHOTO")
    private String photo;

    @ManyToOne()
    @JoinColumn(name = "ID_VILLE")
    @NotFound(action = NotFoundAction.IGNORE)
    private Ville ville;

    @OneToMany()
    private List<Lit> lits;

    public Hospital(String designation)
    {
        super();
        this.designation = designation;
    }

    public Hospital(String designation, Ville ville)
    {
        super();
        this.designation = designation;
        this.ville = ville;
    }

    public Hospital()
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

    public String getRef()
    {
        return ref;
    }

    public void setRef(String ref)
    {
        this.ref = ref;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public String getPhoto()
    {
        return photo;
    }

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    public Ville getVille()
    {
        return ville;
    }

    public void setVille(Ville ville)
    {
        this.ville = ville;
    }

    @JsonIgnore
    @XmlTransient
    public List<Lit> getLits()
    {
        return lits;
    }

    public void setLits(List<Lit> lits)
    {
        this.lits = lits;
    }

}
