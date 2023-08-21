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
@Entity(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMarca")
    private Integer idMarca;

    @Column(name = "nombreMarca", nullable = false, length = 200, unique = true)
    private String nombreMarca;

    @Column(name = "estadoMarca", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer estadoMarca;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date deletedAt;
}
