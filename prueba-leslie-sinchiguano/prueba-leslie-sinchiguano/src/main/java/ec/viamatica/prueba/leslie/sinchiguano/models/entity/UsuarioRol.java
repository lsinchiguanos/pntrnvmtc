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
@Entity(name = "usuarioRol")
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuarioRol")
    private Integer idUsuarioRol;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idRol", nullable = false)
    private Rol rol;

    @Column(name = "passUsuarioRol", nullable = false, length = 25)
    private String passUsuarioRol;

    @Column(name = "estadoUsuarioRol", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    3 -> bloqueado
    * */
    private Integer estadoUsuarioRol;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date deletedAt;
}
