package com.example.BANQUE.ENTITY;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;
@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte{
    private double taux;

    public CompteEpargne() {
    }

    public CompteEpargne(double taux) {
        this.taux = taux;
    }

    public CompteEpargne(String codecompte, Date datecreation, double solde, Client client, double taux) {
        super(codecompte, datecreation, solde, client);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
