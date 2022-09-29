package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClietnteControllers {
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Gui", "123.456.789-10");
	}

	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Guilherme", "123.456.789-11");
	}
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name="id") int id) {
		return new Cliente(id, "Jeff", "123.456.789-12");
	}

}
