package com.sistemaBancario.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaBancario.sistema.model.Agencia;

@Repository
public interface AgenciaRepository extends JpaRepository<Agencia, Integer> {

}
