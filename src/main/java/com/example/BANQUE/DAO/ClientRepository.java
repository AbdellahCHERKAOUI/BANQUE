package com.example.BANQUE.DAO;

import com.example.BANQUE.ENTITY.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
