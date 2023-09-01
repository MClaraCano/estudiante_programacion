package com.example.ejerciciostodocode.service;

import com.example.ejerciciostodocode.model.Tema;
import com.example.ejerciciostodocode.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TemaService implements ITemaService{

    @Autowired
    TemaRepository temaRepository;

    @Override
    public Tema crearTema(Tema tema) {
        return temaRepository.save(tema);
    }


}
