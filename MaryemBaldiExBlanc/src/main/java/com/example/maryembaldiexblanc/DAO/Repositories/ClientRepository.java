package com.example.maryembaldiexblanc.DAO.Repositories;


import com.example.maryembaldiexblanc.DAO.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    Client findByCin(long Cin);
}