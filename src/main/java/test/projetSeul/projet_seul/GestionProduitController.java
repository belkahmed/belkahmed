package test.projetSeul.projet_seul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.projetSeul.projet_seul.entities.Produit;

import java.util.List;

@RestController
public class GestionProduitController {
    @Autowired
    GestionProduitService gestionProduitService;

    @GetMapping("getAllProduit/{PrixAchat}")
    public ResponseEntity<List<Produit>> getAllProduitService(@PathVariable("PrixAchat") int prixAchat) {
        return ResponseEntity.status(200).body(gestionProduitService.getAllProduit(prixAchat));
    }
    @PutMapping("adem")
    public void updateDataProduit()   {
        gestionProduitService.updateAdem();
    }
}
