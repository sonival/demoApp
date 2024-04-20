package demo.interview.ekan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/beneficiario")
public class BeneficiarioController {
    
    @GetMapping
    public String get() {
        return "Hello, World!";
    }

}
