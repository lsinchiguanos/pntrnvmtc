package ec.viamatica.prueba.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity(name = "vehiculoPersona")
public class VehiculoPersona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVehiculoPersona")
    private Integer idVehiculoPersona;

    @ManyToOne
    @JoinColumn(name = "idVehiculo", nullable = false)
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "idTarifa", nullable = false)
    private Tarifa tarifa;

    @Column(name = "valorTarifaVehiculoPersona", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorTarifaVehiculoPersona;

    @Column(name = "estadoVehiculoPersona", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer estadoVehiculoPersona;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date deletedAt;
}
