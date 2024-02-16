package com.example.maryembaldiexblanc.DAO.Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPersonnel;
    String nomPersonnel;
    String prenomPersonnel;
    LocalDate dateNaissanceP;

    TypePersonnel typePersonnel;
    @OneToOne
    Magasin magasin;

    @ManyToOne
    Magasin magasinC;

}