package com.example.BANQUE.ENTITY;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Collection;
@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue
    private Long code;
    private String email;
    private String name;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<Compte>comptes;

    public Client() {
    }

    public Client(Long code, String email, String name, Collection<Compte> comptes) {
        this.code = code;
        this.email = email;
        this.name = name;
        this.comptes = comptes;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String nom) {
        this.email = nom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }
}
