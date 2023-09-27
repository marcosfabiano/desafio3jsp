package com.marcosfabiano.desafio3jsp.repositories;

import com.marcosfabiano.desafio3jsp.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
