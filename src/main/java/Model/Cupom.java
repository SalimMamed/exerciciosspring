package Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_cupom;

    @NotNull
    @Column(name = "id_cliente")
    private Long idCliente;

    @NotNull
    @Column(name = "dt_venda")
    private Date dtVenda;

    @NotNull
    @Column(name = "nr_vlvenda")
    private BigDecimal vlvenda;
}
