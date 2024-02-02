package com.example.BANQUE.METIER;

import com.example.BANQUE.DAO.ClientRepository;
import com.example.BANQUE.ENTITY.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public Client SaveClient(Client client){
        return clientRepository.save(client);
    }

    public Client findById(Long id) {
        Client client= clientRepository.findById(id).get();
        return client;
    }
}
