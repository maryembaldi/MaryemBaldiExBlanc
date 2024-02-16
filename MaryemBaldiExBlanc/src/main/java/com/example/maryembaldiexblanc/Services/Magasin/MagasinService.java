package com.example.maryembaldiexblanc.Services.Magasin;



import com.example.maryembaldiexblanc.DAO.Entities.Magasin;
import com.example.maryembaldiexblanc.DAO.Repositories.MagasinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MagasinService implements IMagasinService {
    MagasinRepository magasinRepository;
    @Override
    public Magasin ajouterMagasinEtPersonnels(Magasin magasin) {
        return magasinRepository.save(magasin);
    }
}
