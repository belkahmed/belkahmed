package test.projetSeul.projet_seul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.projetSeul.projet_seul.entities.Magasin;

import java.util.List;

@Service

public class MagasinService {
    @Autowired
 MagasinRepository magasinRepository;

    public List<Magasin> getListeMagasin(){
        return   magasinRepository.findAll();
    }
    public List<Magasin> getListMagasinByProduit(Long idProduit){
        return magasinRepository.getMagasinByIDProduit(idProduit);
    }
}
