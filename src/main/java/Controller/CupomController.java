package Controller;

import Services.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class CupomController {

    @Autowired
    CupomService service;
    private CupomService cupomRepository;

    @PostMapping("/cupom")
    public ResponseEntity<Exception> salvarCupom (@RequestBody CupomDTO cupom) {
        return cupomRepository.salvar(cupom);
    }
}