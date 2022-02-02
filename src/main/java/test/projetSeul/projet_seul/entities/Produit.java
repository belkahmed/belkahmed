package test.projetSeul.projet_seul.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDateTime;

@Data
@Entity
public class Produit {
    @Id
    private Long id;
    private String nom;
    private String desription;
    private Integer prixAchat;
    private Integer prixVente;
    private LocalDateTime datePublication;
    @Transient
    private Long nombreLigne;
}