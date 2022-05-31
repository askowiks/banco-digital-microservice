package com.letscode.santander.bancoparte2.cpfvalidator.controller;

import com.letscode.santander.bancoparte2.cpfvalidator.service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cpfvalidator")
public class ValidatorController {

    @Autowired
    ValidatorService validatorService;

    @PostMapping("{numero}")
    public Boolean validar(@PathVariable("numero") String numero) {
        return validatorService.validar(numero);
    }

}
