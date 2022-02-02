package test.projetSeul.projet_seul;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControleurTest {

    @GetMapping("/getlistproduit")
    public ResponseEntity< List<String>> GetListeProduit() {
        List<String> ListeProduit = new ArrayList<>();
        ListeProduit.add("produit 01");
        ListeProduit.add("produit 02");
        ListeProduit.add("produit 03");
        ListeProduit.add("produit 04");
        return ResponseEntity.status(200).body(ListeProduit);
    }
}
