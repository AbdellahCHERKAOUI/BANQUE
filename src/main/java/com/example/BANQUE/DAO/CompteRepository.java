package com.example.BANQUE.DAO;

import com.example.BANQUE.ENTITY.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompteRepository extends JpaRepository<Compte,String> {
    @Query("select c from Compte c where c.client.name=:x ")
    Compte findCompteWithClientByCodecompte( @Param("x")String codecompte);
}
