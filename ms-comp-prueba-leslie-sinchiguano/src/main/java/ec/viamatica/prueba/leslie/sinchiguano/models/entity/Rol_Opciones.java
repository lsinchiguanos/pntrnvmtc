package ec.viamatica.prueba.leslie.sinchiguano.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="rol_opciones")
@Data
@AllArgsConstructor
public class Rol_Opciones {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_rol_opciones")
	private int idRolOpciones;
	
	@NotEmpty
	@Column(name="nombre_rol_opciones", nullable = false, unique = true, length = 50)
	private String nombreRolOpciones;
}
