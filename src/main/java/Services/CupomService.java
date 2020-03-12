package Services;
import Model.Cupom;
import Model.ItemCupom;
import Repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("CupomService")
public class CupomService {

    @Autowired
    CupomRepository cupomRepository;

    public ResponseEntity<Exception> salvar(CupomDTO request) {

        if (cupom == null || cupom.getIdClient() == null)
            return ResponseEntity.badRequest().body(new Exception("idClient not Info"));
        if (cupom.getDtVendas() == null)
            return ResponseEntity.badRequest().body(new Exception("Data não existe"));

        Cupom cupomEntity =new Cupom();

        cupomEntity.setIdCliente(cupom.getIdClient);
        cupomEntity.setDtVenda(cupom.getDtVenda);

        List<ItemCupom> listItensC =new ArrayList<>();
        for (cupomDTO itcCupom : cupomEntity.getDtVenda){
            ItemCupom itc = new ItemCupom();
            itc.setIdCupom(itc.getIdItemCupom());
            listItensC.add(itc);
        }
       cupomEntity.setItemCupom(listItensC);

        CupomEntity.setItemCupom(listItensC);
        cupomEntity =cupomRepository.save(CupomEntity);

        cupomDTO.setCdPedido(cupomEntity.getId_cupom());
        return ResponseEntity.ok().body(cupomDTO);

    }
}