package com.letscode.santander.bancoparte1.bancodigitalsimples.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "cpfvalidator-service", url = "http://localhost:8081/cpfvalidator")
public interface CpfValidator {

    @PostMapping("{numero}")
    Boolean validar(@PathVariable("numero") String numero);

}
