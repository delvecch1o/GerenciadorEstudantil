package com.api.gerenciador.services;

import com.api.gerenciador.repositories.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaService {
    @Autowired
    NotaRepository notaRepository;
}