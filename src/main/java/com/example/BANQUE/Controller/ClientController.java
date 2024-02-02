package com.example.BANQUE.Controller;

import com.example.BANQUE.ENTITY.Client;
import com.example.BANQUE.ENTITY.Compte;
import com.example.BANQUE.METIER.ClientService;
import com.example.BANQUE.METIER.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class ClientController {
   private ClientService clientService;
   private CompteService compteService;
     @Autowired
    public ClientController(ClientService clientService,CompteService compteService) {
        this.clientService = clientService;
        this.compteService=compteService;
    }
   /* @PostMapping(value = "/create-client")
    public Client CreateClient(@RequestBody Client client) {
        // Set the associated comptes
        if (client.getComptes() != null) {
            for (Compte compte : client.getComptes()) {
                compte.setClient(client);
            }
        }

        return clientService.SaveClient(client);
    }*/
    @PostMapping(value = "/create-client")
    public Client CreateClient(@RequestBody Client client){
         return clientService.SaveClient(client);
    }
    @GetMapping(value = "/client/{id}")
    public Client ConsulterClient(@PathVariable Long id){
         return clientService.findById(id);
    }

}
