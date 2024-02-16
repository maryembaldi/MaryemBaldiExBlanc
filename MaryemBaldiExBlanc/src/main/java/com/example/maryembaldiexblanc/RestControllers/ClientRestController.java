package com.example.maryembaldiexblanc.RestControllers;


import com.example.maryembaldiexblanc.DAO.Entities.Client;
import com.example.maryembaldiexblanc.Services.Client.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
@AllArgsConstructor
public class ClientRestController {
    IClientService iClientService;
    @PostMapping("ajouterClient")
    Client ajouterClient(@RequestBody Client c) {
        return iClientService.ajouterClient(c);
    }
    @PostMapping("affecterClientAMagasin")
    void affecterClientAMagasin(@RequestParam  int idClient,@RequestParam int idMagasin){
        iClientService.affecterClientAMagasin(idClient,idMagasin);
    };

    @PostMapping("afficherClient")
    List<Client> afficherClients(@RequestParam  String nomMagasin){
        return iClientService.afficherClients(nomMagasin);
    }

}