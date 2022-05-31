package com.letscode.santander.bancoparte1.bancodigitalsimples.controller;

import com.letscode.santander.bancoparte1.bancodigitalsimples.model.Conta;
import com.letscode.santander.bancoparte1.bancodigitalsimples.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping
    public List<Conta> listar() {
        return contaService.listar();
    }

    @PostMapping
    public Conta adicionar(@RequestBody Conta novaConta) {
        return contaService.adicionar(novaConta);
    }

}
