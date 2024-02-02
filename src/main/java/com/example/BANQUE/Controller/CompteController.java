package com.example.BANQUE.Controller;

import com.example.BANQUE.ENTITY.Client;
import com.example.BANQUE.ENTITY.Compte;
import com.example.BANQUE.ENTITY.CompteCourant;
import com.example.BANQUE.ENTITY.CompteEpargne;
import com.example.BANQUE.METIER.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompteController {
    private CompteService compteService;
    @Autowired
    public CompteController(CompteService compteService){
        this.compteService=compteService;
    }
    @GetMapping(value = "/compte/{id}")
    public Compte ConsulterCompte(@PathVariable String id){
        return compteService.GetCompte(id);
    }
    @PostMapping(value = "/create-compte-courant")
    public CompteCourant CreateCompte(@RequestBody CompteCourant compte){
        return compteService.CreateCompteCourant(compte);
    }
    @PostMapping(value = "/create-compte-epargne")
    public CompteEpargne CreateCompteEpargne(@RequestBody CompteEpargne compte){
        return compteService.CreateCompteEpargne(compte);
    }


}
