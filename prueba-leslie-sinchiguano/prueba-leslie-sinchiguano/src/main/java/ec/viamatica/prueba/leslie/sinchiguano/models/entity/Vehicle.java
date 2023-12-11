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
@Entity(name = "vehicle")
public class Vehicle {

    @Id
    @Column(name = "id_vehicle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVehicle;

    @ManyToOne
    @JoinColumn(name = "id_person", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "id_marca", nullable = false)
    private Marca marca;

    @Column(name = "plate", nullable = false, unique = true, length = 10)
    private String plateVehicle;

    @Column(name = "model", nullable = false)
    private String modelVehicle;

    @Column(name = "years", nullable = false)
    private Integer yearVehicle;

    @Column(name = "observation", length = 50, insertable = false, columnDefinition = "character varying(50) default 'Sin Observacion alguna'")
    private String observationVehicle;

    @Column(name = "status", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer statusVehicle;

    @Column(name = "date_at", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date dateAt;

    @Column(name = "date_up", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateUp;

    @Column(name = "date_del", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateDel;
}
