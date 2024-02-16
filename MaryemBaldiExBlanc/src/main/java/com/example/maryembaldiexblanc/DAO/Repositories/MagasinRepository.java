package com.example.maryembaldiexblanc.DAO.Repositories;

import com.example.maryembaldiexblanc.DAO.Entities.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MagasinRepository extends JpaRepository<Magasin,Integer> {
    Magasin findMagasinByNomMagasin(String nomMagasin);
}