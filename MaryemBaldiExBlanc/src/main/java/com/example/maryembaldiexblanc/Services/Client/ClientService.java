package com.example.maryembaldiexblanc.Services.Client;


import com.example.maryembaldiexblanc.DAO.Entities.Client;
import com.example.maryembaldiexblanc.DAO.Entities.Magasin;
import com.example.maryembaldiexblanc.DAO.Repositories.ClientRepository;
import com.example.maryembaldiexblanc.DAO.Repositories.MagasinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{
    ClientRepository clientRepository;
    MagasinRepository magasinRepository;
    @Override
    public Client ajouterClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void affecterClientAMagasin(int idClient, int idMagasin) {
        Client client = clientRepository.findById(idClient).orElseThrow();
        Magasin magasin = magasinRepository.findById(idMagasin).orElseThrow();
        client.getMagasins().add(magasin);
        clientRepository.save(client);
    }

    @Override
    public List<Client> afficherClients(String nomMagasin) {
        Magasin magasin = magasinRepository.findMagasinByNomMagasin(nomMagasin);
        return magasin.getClients();
    }
}