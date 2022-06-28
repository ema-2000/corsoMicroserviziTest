package com.example.microserviziocorso.service;


import com.example.microserviziocorso.entity.Corso;
import com.example.microserviziocorso.repository.CorsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorsoServiceImpl implements CorsoService {

    @Autowired
    CorsoRepository corsoRepository;


    @Override
    public void saveCorso(Corso corso) {
        corsoRepository.save(corso);
    }
}
