package com.letscode.santander.bancoparte1.bancodigitalsimples.service;

import com.letscode.santander.bancoparte1.bancodigitalsimples.client.CpfValidator;
import com.letscode.santander.bancoparte1.bancodigitalsimples.model.Conta;
import com.letscode.santander.bancoparte1.bancodigitalsimples.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    ContaRepository contaRepository;

    @Autowired
    CpfValidator cpfValidator;

    public List<Conta> listar() {
        return contaRepository.findAll();
    }

    public Conta adicionar(Conta novaConta) {
        Boolean cpfOk = cpfValidator.validar(novaConta.getCpf());

        if (cpfOk) {
            return contaRepository.save(novaConta);
        }

        return null;
    }

}
