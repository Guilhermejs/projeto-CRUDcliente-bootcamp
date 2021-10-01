package com.guijacques.CRUDClientes.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guijacques.CRUDClientes.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Aura Martins", "12345678910", 2000.00, Instant.now(), 2));
		list.add(new Client(2L, "Andreia Melo", "10987654321", 3000.00, Instant.now(), 3));
		return ResponseEntity.ok().body(list);
	}
}
