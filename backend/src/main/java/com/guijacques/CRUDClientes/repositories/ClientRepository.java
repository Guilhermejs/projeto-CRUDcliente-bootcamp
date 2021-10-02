package com.guijacques.CRUDClientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guijacques.CRUDClientes.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
