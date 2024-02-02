package com.example.BANQUE.Controller;
import com.example.BANQUE.ENTITY.Dtoverment;
import com.example.BANQUE.ENTITY.Operation;

import com.example.BANQUE.ENTITY.Verment;
import com.example.BANQUE.ENTITY.YourDTO;
import com.example.BANQUE.METIER.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OperationController {
    private OperationService operationService;

    @Autowired
    public OperationController(OperationService operationService){
        this.operationService=operationService;

    }
    @PostMapping(value = "/versait")
    public void versait(@RequestBody YourDTO yourDTO){
        operationService.versait(yourDTO.getCodecompte(), yourDTO.getMantant());

    }
    @PostMapping(value = "/retrait")
    public void retrait(@RequestBody YourDTO yourDTO){
        operationService.retrait(yourDTO.getCodecompte(), yourDTO.getMantant());

    }
    @PostMapping(value = "/verment")
    public void addvement(@RequestBody Dtoverment dtoverment){
        operationService.addverment(dtoverment.getCodecompte(), dtoverment.getMantant(), dtoverment.getCodeCompte2());
    }

    @GetMapping(value = "/alloperation/{codecompte}")
    public List<Operation> AllOperations(@PathVariable String codecompte){
        List<Operation>operations= operationService.getalloperations(codecompte);
        return operations;
    }
}
