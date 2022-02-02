package test.projetSeul.projet_seul.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Magasin {
    @Id
    private Long id;
    private String nom;
    private String adresse;
    private Long idProduit;
}
