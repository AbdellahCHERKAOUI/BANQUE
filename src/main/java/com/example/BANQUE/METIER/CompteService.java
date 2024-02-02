package com.example.BANQUE.METIER;

import com.example.BANQUE.DAO.CompteRepository;
import com.example.BANQUE.ENTITY.Compte;
import com.example.BANQUE.ENTITY.CompteCourant;
import com.example.BANQUE.ENTITY.CompteEpargne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteService {
    private CompteRepository compteRepository;
    @Autowired
    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }
    public Compte GetCompte(String id){
    return compteRepository.findCompteWithClientByCodecompte(id);
    }
    public CompteCourant CreateCompteCourant(CompteCourant compte){
    return compteRepository.save(compte);
    }
    public CompteEpargne CreateCompteEpargne(CompteEpargne compte){
        return compteRepository.save(compte);
    }


}
