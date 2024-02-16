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
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMagasin;
    String nomMagasin;
    String addresseMagasin;
    long contactMagasin ;

    @OneToOne (mappedBy = "magasin",cascade = CascadeType.ALL)
    Personnel directeur;

    @OneToMany(mappedBy = "magasinC",cascade = CascadeType.ALL)
    List<Personnel> cassiers;

    @ManyToMany(mappedBy = "magasins")
    List<Client> clients;


}