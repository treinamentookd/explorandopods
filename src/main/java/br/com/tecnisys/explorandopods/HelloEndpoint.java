package br.com.tecnisys.explorandopods;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController("/")
public class HelloEndpoint {

    @Value("${nome}")
    private String nome;

    @GetMapping
    public String digaOla(){
        return "Ol\u00E1, "+nome;
    }

}
