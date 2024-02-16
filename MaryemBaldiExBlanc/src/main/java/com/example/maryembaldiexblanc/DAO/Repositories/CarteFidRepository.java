package com.example.maryembaldiexblanc.DAO.Repositories;


import com.example.maryembaldiexblanc.DAO.Entities.CarteFid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteFidRepository extends JpaRepository<CarteFid,Integer> {
    CarteFid findByNumeroCarte(long numeroCarte);
}
