/*
package com.example.BANQUE.WEB;


import com.example.BANQUE.DAO.ClientRepository;
import com.example.BANQUE.DAO.CompteRepository;

import com.example.BANQUE.DAO.OperationRepository;
import com.example.BANQUE.ENTITY.Compte;
import com.example.BANQUE.ENTITY.Operation;
import com.example.BANQUE.METIER.Ibanque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BanqueController {
    @Autowired
    private OperationRepository operationRepository;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private Ibanque ibanque;
    @RequestMapping(value = "/compte")
    public String index(Model model){

        return "compte";
    }
    @RequestMapping(value = "/consulter")
    public String index(Model model, String codecompte, @RequestParam(name ="page",defaultValue = "0") int page,
                        @RequestParam(name ="size",defaultValue = "4")int size){
        model.addAttribute("codecompte",codecompte);

         try {
             Compte cp =ibanque.consulterCompte(codecompte);

            Page<Operation> ops = ibanque.listoperation(codecompte,page,size);
            model.addAttribute("ops",ops.getContent());
            int[]pages=new int[ops.getTotalPages()];
            model.addAttribute("pages",pages);
            model.addAttribute("cp",cp);
       }catch (Exception e) {
             model.addAttribute("exception", e);
         }
        return "compte";

    }
    @RequestMapping(value = "/save")
    public String verser(Model model,String typeoperation,String codecompte,double mantant,String codecomte2){
        try {


        if (typeoperation.equals("VRS")){
            ibanque.versait(codecompte,mantant);
        } else if (typeoperation.equals("RTR")) {
            ibanque.retrait(codecompte,mantant);
        }else {
            ibanque.verment(codecompte,codecomte2,mantant);
        }
        }catch (Exception e){
            model.addAttribute("exception", e);
        }


        return "redirect:/consulter?codecompte="+codecompte;
    }


}
*/
