package com.example.maryembaldiexblanc.DAO.Entities;



import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idClient;
    String nomClient;
    String prenomClient ;
    String adresseClient;
    @Column(unique=true)
    long cin ;

    @ManyToMany
    List<Magasin>magasins;

    @OneToOne
    CarteFid carteFid;
}