package ec.viamatica.prueba.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import lombok.*;
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
@Entity(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private Integer idUsers;

    @ManyToOne
    @JoinColumn(name = "id_person", nullable = false)
    private Person persona;

    @Column(name = "name_users", nullable = false, length = 25, unique = true)
    private String nameUsers;

    @Column(name = "intent_users")
    private Integer intentUsers;

    @Column(name = "status_users", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    3 -> bloqueado
    * */
    private Integer statusUsers;

    @Column(name = "date_at", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date dateAt;

    @Column(name = "date_up", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateUp;

    @Column(name = "date_del", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateDel;

}
