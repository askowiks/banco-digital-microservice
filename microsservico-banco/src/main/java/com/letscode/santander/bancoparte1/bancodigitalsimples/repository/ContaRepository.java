package com.letscode.santander.bancoparte1.bancodigitalsimples.repository;

import com.letscode.santander.bancoparte1.bancodigitalsimples.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
}
