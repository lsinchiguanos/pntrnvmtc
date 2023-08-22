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
@Entity(name = "tarifa")
public class Tarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTarifa")
    private Integer idTarifa;

    @Column(name = "descripcionTarifa", nullable = false, length = 50, unique = true)
    private String descripcionTarifa;

    @Column(name = "valorTarifa", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorTarifa;

    @Column(name = "estadoTarifa", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer estadoTarifa;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date deletedAt;
}
