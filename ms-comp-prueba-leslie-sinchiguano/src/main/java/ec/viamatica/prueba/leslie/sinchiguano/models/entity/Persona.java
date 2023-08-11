package ec.viamatica.prueba.leslie.sinchiguano.models.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.AllArgsConstructor;

@Entity
@Table(name="persona")
@Data
@AllArgsConstructor
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_persona")
	private  int idPersona;
	
	@NotEmpty
	@Column(name="nombre_persona", nullable = false, length = 60)
	private  String nombresPersonas;
	
	@NotEmpty
	@Column(name="apellido_persona", nullable = false, length = 60)
	private  String apellidosPersonas;
	
	@NotEmpty
	@Column(name="identificacion_persona", nullable = false, unique = true, length = 10)
	private  String identificacionPersonas;
	
	@NotEmpty
	@Column(name="fecha_nacimiento", nullable=true)
	@Temporal(TemporalType.DATE)
	private  Date fnacimientoPersona;
}
