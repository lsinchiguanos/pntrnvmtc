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
@Entity(name = "binnacle")
public class Binnacle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_binnacle")
    private Integer idBinnacle;

    @ManyToOne
    @JoinColumn(name = "id_parking", nullable = false)
    private Parking parking;

    @ManyToOne
    @JoinColumn(name = "id_vehicle", nullable = false)
    private Vehicle vehicle;

    @Column(name = "admission_date", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date admissionDateBinnacle;

    @Column(name = "departure_date", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date departureDateBinnacle;

    @ManyToOne
    @JoinColumn(name = "id_tariff", nullable = false)
    private Tariff tariff;

    @Column(name = "amount", nullable = false, precision = 8, scale = 4)
    private BigDecimal amountTariff;

    @Column(name = "status", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> Pendiente
    2 -> Pagado
    3 -> Adeudado
    * */
    private Integer statusParking;

    @Column(name = "date_at", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date dateAt;

    @Column(name = "date_up", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateUp;

    @Column(name = "date_del", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateDel;
}
