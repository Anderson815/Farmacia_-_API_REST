package com.generation.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmacia.model.Produto;
import com.generation.farmacia.repository.ProdutoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAllProduto(){
		return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
	}
 }
