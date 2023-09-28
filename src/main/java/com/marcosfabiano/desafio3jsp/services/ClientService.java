package com.marcosfabiano.desafio3jsp.services;

import com.marcosfabiano.desafio3jsp.dto.ClientDTO;
import com.marcosfabiano.desafio3jsp.entities.Client;
import com.marcosfabiano.desafio3jsp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }
}
