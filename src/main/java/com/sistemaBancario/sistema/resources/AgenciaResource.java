package com.sistemaBancario.sistema.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaBancario.sistema.model.Agencia;
import com.sistemaBancario.sistema.repositorios.AgenciaRepository;


@RestController
@RequestMapping("/api/agencia")
public class AgenciaResource {
	
	@Autowired
	AgenciaRepository agenciaRepository;
	
	@GetMapping
	public List<Agencia> get(){
		return agenciaRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Agencia get(@PathVariable("id") Integer id) {
		return agenciaRepository.getOne(id);
	}
	
	@PostMapping
	public Agencia save(@RequestBody Agencia agencia) {
		return agenciaRepository.save(agencia);
	}
	
	@PutMapping
	public Agencia update(@RequestBody Agencia agencia) {
		return agenciaRepository.save(agencia);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		agenciaRepository.deleteById(id);
	}

}
