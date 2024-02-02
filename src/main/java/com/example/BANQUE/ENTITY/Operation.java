package com.example.BANQUE.ENTITY;



import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE-OP",discriminatorType = DiscriminatorType.STRING,length = 1)
public abstract class Operation implements Serializable {
    @Id @GeneratedValue
    private Long numero;
    private Date dateopertion;
    private double mantant;
    @ManyToOne
    @JoinColumn(name = "CODE-CP")
    private Compte compte;

    public Operation() {
    }

    public Operation( Date dateopertion, double mantant, Compte compte) {;
        this.dateopertion = dateopertion;
        this.mantant = mantant;
        this.compte = compte;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getDateopertion() {
        return dateopertion;
    }

    public void setDateopertion(Date dateopertion) {
        this.dateopertion = dateopertion;
    }

    public double getMantant() {
        return mantant;
    }

    public void setMantant(double mantant) {
        this.mantant = mantant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
