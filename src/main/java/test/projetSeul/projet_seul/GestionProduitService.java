package test.projetSeul.projet_seul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.projetSeul.projet_seul.entities.Produit;

import java.util.List;

@Service
public class GestionProduitService {
    @Autowired
    GestionProduitRepository gestionProduitRepository;

    public List<Produit> getAllProduit(int prixAchat) {

        //return gestionProduitRepository.findAll();
        return gestionProduitRepository.getProduitCher(prixAchat);
    }

    public void updateAdem() {
        Produit produit = gestionProduitRepository.getById(1L);
        produit.setPrixAchat(205);
        gestionProduitRepository.save(produit);
    }
}
