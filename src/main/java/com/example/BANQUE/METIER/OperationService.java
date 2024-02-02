package com.example.BANQUE.METIER;

import com.example.BANQUE.DAO.CompteRepository;
import com.example.BANQUE.DAO.OperationRepository;
import com.example.BANQUE.ENTITY.Compte;
import com.example.BANQUE.ENTITY.Operation;
import com.example.BANQUE.ENTITY.Retrait;
import com.example.BANQUE.ENTITY.Verment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OperationService {
    private OperationRepository operationRepository;
    private CompteRepository compteRepository;
    @Autowired
    public OperationService (OperationRepository operationRepository,CompteRepository compteRepository){
        this.operationRepository=operationRepository;
        this.compteRepository=compteRepository;
    }
   @Transactional
   public void versait(String codecompte, double montant) {
       Optional<Compte> optionalCompte = compteRepository.findById(codecompte);
       if (optionalCompte.isPresent()) {
           Compte cp = optionalCompte.get();
           Verment v = new Verment(new Date(), montant, cp);
           operationRepository.save(v);

           cp.setSolde(cp.getSolde() + montant);
           compteRepository.save(cp);
       } else {
           throw new RuntimeException("Compte introuvable");
       }
   }
    @Transactional
    public void retrait(String codecompte, double montant) {
        Optional<Compte> optionalCompte = compteRepository.findById(codecompte);

        if (optionalCompte.isPresent()) {
            Compte cp = optionalCompte.get();
            if (cp.getSolde()>montant){
                Retrait retrait = new Retrait(new Date(), montant, cp);
                operationRepository.save(retrait);

                cp.setSolde(cp.getSolde() - montant);
                compteRepository.save(cp);
            }else{
                throw new RuntimeException("compte khawi") ;
            }

        } else {
            throw new RuntimeException("Compte introuvable");
        }
    }
    public void addverment(String codeCompte1,double mantant,String codeCompte2){
        retrait(codeCompte1,mantant);
        versait(codeCompte2,mantant);

    }

   public List<Operation> getalloperations(String codecompte){
        List<Operation>operations=operationRepository.listoperation(codecompte);
        return operations;
    }
}
