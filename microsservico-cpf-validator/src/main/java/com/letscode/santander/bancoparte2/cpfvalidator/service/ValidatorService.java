package com.letscode.santander.bancoparte2.cpfvalidator.service;

import br.com.caelum.stella.validation.CPFValidator;
import org.springframework.stereotype.Service;

@Service
public class ValidatorService {

    public Boolean validar(String numero) {
        CPFValidator validator = new CPFValidator();

        try {
            validator.assertValid(numero);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
