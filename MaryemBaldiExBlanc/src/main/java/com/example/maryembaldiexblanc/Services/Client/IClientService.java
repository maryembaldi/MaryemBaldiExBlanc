package com.example.maryembaldiexblanc.Services.Client;

import com.example.maryembaldiexblanc.DAO.Entities.Client;

import java.util.List;

public interface IClientService {
        Client ajouterClient(Client c);
        void affecterClientAMagasin(int idClient,int idMagasin);
        List<Client> afficherClients(String nomMagasin);
    }

