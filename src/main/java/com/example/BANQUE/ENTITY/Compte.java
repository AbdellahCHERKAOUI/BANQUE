package com.example.BANQUE.ENTITY;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE-CP",discriminatorType = DiscriminatorType.STRING,length = 2)
public abstract class Compte implements Serializable {
    @Id
    private String codecompte;
    private Date datecreation;
    private double solde;
    @ManyToOne
    @JoinColumn(name = "CODE-CLI")
    @JsonBackReference
    private Client client;
    @OneToMany(mappedBy = "compte")
    @JsonIgnore
    private Collection<Operation>operations;

    public Compte() {
    }

    public Compte( String codecompte, Date datecreation, double solde,  Client client) {
        this.codecompte = codecompte;
        this.datecreation = datecreation;
        this.solde = solde;
        this.client = client;

    }

    public String getCodecompte() {
        return codecompte;
    }

    public void setCodecompte(String codecompte) {
        this.codecompte = codecompte;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Collection<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Collection<Operation> operations) {
        this.operations = operations;
    }
}
