package com.example.maryembaldiexblanc.Services.carte;


import com.example.maryembaldiexblanc.DAO.Entities.CarteFid;

public interface ICarteService {
    void ajouterCarteEtAffecterClient(CarteFid carteFid, long cin);
    long effectuerOperation(String typeOperation, long numCarte, int montant);
}