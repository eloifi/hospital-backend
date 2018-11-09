package com.model.acceuil;

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

    /**
     * @return the username
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * @param username the username to set
     */
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

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Patient [id=" + id + ", ref=" + ref + ", username=" + username + ", nom=" + nom + ", prenom=" + prenom
            + ", birthday=" + birthday + ", sexe=" + sexe + ", telephone=" + telephone + ", passeport=" + passeport
            + ", cin=" + cin + ", Hospitalisation=" + Hospitalisation + "]";
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Hospitalisation == null) ? 0 : Hospitalisation.hashCode());
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + ((cin == null) ? 0 : cin.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((passeport == null) ? 0 : passeport.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        result = prime * result + ((ref == null) ? 0 : ref.hashCode());
        result = prime * result + ((sexe == null) ? 0 : sexe.hashCode());
        result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Patient other = (Patient) obj;
        if (Hospitalisation == null) {
            if (other.Hospitalisation != null)
                return false;
        } else if (!Hospitalisation.equals(other.Hospitalisation))
            return false;
        if (birthday == null) {
            if (other.birthday != null)
                return false;
        } else if (!birthday.equals(other.birthday))
            return false;
        if (cin == null) {
            if (other.cin != null)
                return false;
        } else if (!cin.equals(other.cin))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (passeport == null) {
            if (other.passeport != null)
                return false;
        } else if (!passeport.equals(other.passeport))
            return false;
        if (prenom == null) {
            if (other.prenom != null)
                return false;
        } else if (!prenom.equals(other.prenom))
            return false;
        if (ref == null) {
            if (other.ref != null)
                return false;
        } else if (!ref.equals(other.ref))
            return false;
        if (sexe == null) {
            if (other.sexe != null)
                return false;
        } else if (!sexe.equals(other.sexe))
            return false;
        if (telephone == null) {
            if (other.telephone != null)
                return false;
        } else if (!telephone.equals(other.telephone))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }

}
