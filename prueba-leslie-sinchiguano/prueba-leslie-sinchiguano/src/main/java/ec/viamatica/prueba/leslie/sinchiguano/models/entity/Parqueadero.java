package ec.viamatica.prueba.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity(name = "parqueadero")
public class Parqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idParqueadero")
    private Integer idParqueadero;

    @Column(name = "descripcionParqueadero", nullable = false, length = 200, unique = true)
    private String descripcionParqueadero;

    @Column(name = "estadoParqueadero", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer estadoParqueadero;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date deletedAt;
}
