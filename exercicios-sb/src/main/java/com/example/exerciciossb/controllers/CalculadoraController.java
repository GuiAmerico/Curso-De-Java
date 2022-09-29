package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.Calculadora;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {
	@GetMapping("/soma/{a}/{b}")
	public int soma(@PathVariable int a,@PathVariable int b) {
		return Calculadora.somar(a, b);
	}
	
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name="a") int a,@RequestParam(name="b") int b) {
		return Calculadora.subtrair(a, b);
	}
}
