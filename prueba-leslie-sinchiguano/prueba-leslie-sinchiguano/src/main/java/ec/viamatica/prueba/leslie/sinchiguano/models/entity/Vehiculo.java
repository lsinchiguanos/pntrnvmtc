package ec.viamatica.prueba.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "vehiculo")
public class Vehiculo {

    @Id
    @Column(name = "idVehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVehiculo;

    @ManyToOne
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "idMarca", nullable = false)
    private Marca marca;

    @Column(name = "matriculaVehiculo", nullable = false, unique = true, length = 10)
    private String matriculaVehiculo;

    @Column(name = "modeloVehiculo", nullable = false)
    private String modeloVehiculo;

    @Column(name = "anyoVehiculo", nullable = false)
    private Integer anyoVehiculo;

    @Column(name = "observacionVehiculo", length = 50, insertable = false, columnDefinition = "character varying(50) default 'Sin Observacion alguna'")
    private String observacionVehiculo;

    @Column(name = "estadoVehiculo", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer estadoVehiculo;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date deletedAt;
}
