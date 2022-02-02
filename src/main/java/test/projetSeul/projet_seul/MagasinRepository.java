package test.projetSeul.projet_seul;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import test.projetSeul.projet_seul.entities.Magasin;
import test.projetSeul.projet_seul.entities.Produit;

import java.util.List;

@Repository
public interface MagasinRepository extends JpaRepository<Magasin,Long>  {


    @Query(value = "select * from magasin where id_produit = :idProduit",nativeQuery = true)
    List<Magasin> getMagasinByIDProduit(Long idProduit);
}
