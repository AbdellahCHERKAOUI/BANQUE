package com.example.BANQUE.WEB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientWebController {
    @RequestMapping(value = "/client")
    public String index(){
        return "client";
    }
    @RequestMapping(value = "/create-account")
    public String createAccount(){
        return "compte";
    }
    @RequestMapping(value = "/c")
    public String CreateCompte(){
        return "cc";
    }

    @RequestMapping(value = "/operation")
    public String operation(){
        return "operation";
    }
    @RequestMapping(value = "/allop")
    public String alloperation(){
        return "operations";
    }
    @RequestMapping(value = "/shingami")
    public String shingami(){
        return "shingami";
    }

}
