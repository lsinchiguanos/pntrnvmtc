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
@Entity(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Integer idPerson;

    @Column(name = "identification", nullable = false, length = 13, unique = true)
    private String identificationPerson;

    @Column(name = "name", nullable = false, length = 200)
    private String namePerson;

    @Column(name = "last_name", nullable = false, length = 200)
    private String lastNamePersona;

    @Column(name = "email", nullable = false, length = 50)
    private String emailPerson;

    @Column(name = "status", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer statusPerson;

    @Column(name = "date_at", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date dateAt;

    @Column(name = "date_up", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateUp;

    @Column(name = "date_del", insertable = false, updatable = false, columnDefinition = "timestamp")
    private Date dateDel;
}
