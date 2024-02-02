package com.example.BANQUE.ENTITY;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant() {
    }

    public CompteCourant(double decouvert) {
        this.decouvert = decouvert;
    }

    public CompteCourant(String codecompte, Date datecreation, double solde, Client client, double decouvert) {
        super(codecompte, datecreation, solde, client);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
