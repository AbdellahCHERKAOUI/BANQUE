package com.example.BANQUE.ENTITY;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;
@Entity
@DiscriminatorValue("V")
public class Verment extends Operation{
    public Verment() {
    }

    public Verment(Date dateopertion, double mantant, Compte compte) {
        super(dateopertion, mantant, compte);
    }
}
