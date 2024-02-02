package com.example.BANQUE.ENTITY;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;
@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation{
    public Retrait() {
    }

    public Retrait(Date dateopertion, double mantant, Compte compte) {
        super(dateopertion, mantant, compte);
    }
}
