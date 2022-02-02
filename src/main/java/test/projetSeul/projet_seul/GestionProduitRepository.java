package test.projetSeul.projet_seul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import test.projetSeul.projet_seul.entities.Produit;

import java.util.List;

@Repository
public interface GestionProduitRepository extends JpaRepository<Produit,Long> {


    @Query(value = "select * from produit where prix_achat > :prixAchat",nativeQuery = true)
      List<Produit> getProduitCher(int prixAchat);
}
