package test.projetSeul.projet_seul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.projetSeul.projet_seul.entities.Magasin;

import java.util.List;

@RestController
public class MagasinController {
    @Autowired
    MagasinService magasinService;

    @GetMapping("getListeMagasin")
    public ResponseEntity<List<Magasin>> getListeMagasin() {
        return ResponseEntity.status(200).body(magasinService.getListeMagasin());
    }

    @GetMapping("getMagasinByIdProduit")
    public ResponseEntity<List<Magasin>> getMagasinByIDProduit(@RequestParam("id_Produit") Long idProduit) {
        return ResponseEntity.status(200).body(magasinService.getListMagasinByProduit(idProduit));
    }
}
