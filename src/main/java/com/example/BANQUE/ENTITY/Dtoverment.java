package com.example.BANQUE.ENTITY;

public class Dtoverment extends YourDTO{
    private String codeCompte2;

    public Dtoverment() {
    }

    public Dtoverment(String codeCompte2 ) {
        this.codeCompte2 = codeCompte2;
    }

    public String getCodeCompte2() {
        return codeCompte2;
    }

    public void setCodeCompte2(String codeCompte2) {
        this.codeCompte2 = codeCompte2;
    }
}
