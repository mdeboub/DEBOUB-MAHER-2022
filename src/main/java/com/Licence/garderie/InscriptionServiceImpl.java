package com.Licence.garderie;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InscriptionServiceImpl implements InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Override
    public List < Inscription > getAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public void saveInscription(Inscription inscription) {
        this.inscriptionRepository.save(inscription);
    }
    
    @Override
    public void updateInscription(Inscription inscription) {
        this.inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription getInscriptionById(long id) {
        Optional < Inscription > optional = inscriptionRepository.findById(id);
        Inscription inscription = null;
        if (optional.isPresent()) {
        	inscription = optional.get();
        } else {
            throw new RuntimeException(" Inscription not found for id :: " + id);
        }
        return inscription;
    }

    @Override
    public void deleteInscriptionById(long id) {
        this.inscriptionRepository.deleteById(id);
    }
}
