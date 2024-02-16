package com.example.maryembaldiexblanc.RestControllers;

import com.example.maryembaldiexblanc.DAO.Entities.Magasin;
import com.example.maryembaldiexblanc.Services.Magasin.IMagasinService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("magasin")
@AllArgsConstructor
public class MagasinRestController {
    IMagasinService iMagasinService;
    @PostMapping("ajouterMagasinEtPersonnels")
    Magasin ajouterMagasinEtPersonnel(@RequestBody Magasin m) {
        return iMagasinService.ajouterMagasinEtPersonnels(m);
    }
}