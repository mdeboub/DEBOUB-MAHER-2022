package com.Licence.garderie;

import java.util.List;



public interface InscriptionService {
    List < Inscription > getAllInscriptions();
    void saveInscription(Inscription inscription);
    void updateInscription(Inscription inscription);
    Inscription getInscriptionById(long id);
    void deleteInscriptionById(long id);
}
