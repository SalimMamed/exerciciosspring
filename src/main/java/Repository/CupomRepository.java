package Repository;

import Model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {

    public List<Cupom> findByIdClienteAndDtVenda(Long idCliente, Date dtVenda);

}