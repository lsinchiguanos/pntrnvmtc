package ec.viamatica.prueba.leslie.sinchiguano.models.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="sessions")
@Data
@AllArgsConstructor
public class Sesion {
	
	@Id
    private Long id;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@Column(name="fecha_ingreso", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fechaIngreso = new Date();
	
	@Column(name="fecha_cierre", nullable=true)
	private Date fechaCierre;
}
