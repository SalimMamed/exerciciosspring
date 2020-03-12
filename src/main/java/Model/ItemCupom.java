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
@Table(name = "tb_item_cupom")
public class ItemCupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_item_cupom;

    @NotNull
    @JoinColumn(name = "tb_cupom")
    private Long idCupom;

    @NotNull
    @JoinColumn(name = "tb_produto")
    private Long idProduto;

    @NotNull
    @Column(name = "nr_vlproduto")
    private BigDecimal vlproduto;
}
