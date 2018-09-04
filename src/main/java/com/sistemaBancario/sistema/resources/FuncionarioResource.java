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

import com.sistemaBancario.sistema.model.Funcionario;
import com.sistemaBancario.sistema.repositorios.FuncionarioRepository;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioResource {
	
	@Autowired
	FuncionarioRepository FuncionarioRepository;
	
	@GetMapping
	public List<Funcionario> get(){
		return FuncionarioRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Funcionario get(@PathVariable("id") Integer id) {
		return FuncionarioRepository.getOne(id);
	}
	
	@PostMapping
	public Funcionario save(@RequestBody Funcionario func) {
		return FuncionarioRepository.save(func);
	}
	
	@PutMapping
	public Funcionario update(@RequestBody Funcionario func) {
		return FuncionarioRepository.save(func);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		FuncionarioRepository.deleteById(id);
	}


}
