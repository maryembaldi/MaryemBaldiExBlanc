package com.example.maryembaldiexblanc.RestControllers;


import com.example.maryembaldiexblanc.DAO.Entities.CarteFid;
import com.example.maryembaldiexblanc.Services.carte.ICarteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("carte")
@AllArgsConstructor
public class CarteRestController {
    ICarteService iCarteService;
    @PostMapping("ajouterCarteEtAffecterClient")
    void ajouterCarteEtAffecterClient(@RequestBody CarteFid carteFid, @RequestParam long cin) {
        iCarteService.ajouterCarteEtAffecterClient(carteFid, cin);
    }

    @PostMapping("effectuerOperation")
    long effectuerOperation(@RequestParam String typeOperation, @RequestParam long numCarte,@RequestParam  int montant) {
        return iCarteService.effectuerOperation(typeOperation, numCarte, montant);
    }
}