/*
package com.example.BANQUE.METIER;

import com.example.BANQUE.DAO.CompteRepository;
import com.example.BANQUE.DAO.OperationRepository;
import com.example.BANQUE.ENTITY.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class BanqueServise implements Ibanque{
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private OperationRepository operationRepository;
    @Override
    public Compte consulterCompte(String codecompte) {
       Compte cp=compteRepository.findById(codecompte).get();
       if(cp==null)throw new RuntimeException("compte introvable");
    return cp;
    }

    @Override
    public void versait(String code, double man) {
    Compte cp=compteRepository.findById(code).get();
        if(cp==null)throw new RuntimeException("compte introvable");
        Verment v=new Verment(new Date(),man,cp);
        operationRepository.save(v);
        cp.setSolde(cp.getSolde()+man);
        compteRepository.save(cp);
    }

    @Override
    public void retrait(String codecompte, double mantant) {
        Compte cp=compteRepository.findById(codecompte).get();
        double fcc=0;
        if (cp instanceof CompteCourant)
            fcc= ((CompteCourant) cp).getDecouvert();
        if (cp.getSolde()+fcc<mantant)throw new RuntimeException("compte insufisant");

        Retrait r=new Retrait(new Date(),mantant,cp);
        operationRepository.save(r);
        cp.setSolde(cp.getSolde()-mantant);
        compteRepository.save(cp);
    }

    @Override
    public void verment(String codecompte1, String codecompte2, double mantant) {
     retrait(codecompte1,mantant);
     versait(codecompte2,mantant);
    }


    @Override
    public Page<Operation> listoperation(String codecompte, int page, int size) {
        return operationRepository.listoperation(codecompte,  PageRequest.of(page,size));
    }

}
*/
