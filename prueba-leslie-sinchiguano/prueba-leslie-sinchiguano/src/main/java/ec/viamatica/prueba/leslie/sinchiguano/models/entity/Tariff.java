package ec.viamatica.prueba.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tariff")
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tariff")
    private Integer idTariff;

    @Column(name = "description", nullable = false, length = 50, unique = true)
    private String descriptionTariff;

    @Column(name = "amount", nullable = false, precision = 8, scale = 4)
    private BigDecimal amountTariff;

    @Column(name = "status", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer statusTariff;

    @Column(name = "date_at", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date dateAt;

    @Column(name = "date_up", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateUp;

    @Column(name = "date_del", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateDel;
}
