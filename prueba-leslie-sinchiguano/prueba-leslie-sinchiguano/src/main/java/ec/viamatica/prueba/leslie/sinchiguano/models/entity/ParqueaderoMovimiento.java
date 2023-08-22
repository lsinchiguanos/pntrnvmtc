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
@Entity(name = "parqueaderoMovimiento")
public class ParqueaderoMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idParqueaderoMovimiento")
    private Integer idParqueaderoMovimiento;

    @ManyToOne
    @JoinColumn(name = "idParquedero", nullable = false)
    private Parqueadero parqueadero;

    @ManyToOne
    @JoinColumn(name = "idVehiculo", nullable = false)
    private Vehiculo vehiculo;

    @Column(name = "fIngresoParqueaderoMovimiento", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date fechaIngresoParqueaderoMovimiento;

    @Column(name = "fSalidaParqueaderoMovimiento", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date fechaSalidaParqueaderoMovimiento;

    @ManyToOne
    @JoinColumn(name = "idTarifa", nullable = false)
    private Tarifa tarifa;

    @Column(name = "valorParqueaderoMovimiento", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorTarifa;

    @Column(name = "estadoParqueaderoMovimiento", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> Pendiente
    2 -> Pagado
    3 -> Adeudado
    * */
    private Integer estadoParqueaderoMovimiento;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date updatedAt;
}
