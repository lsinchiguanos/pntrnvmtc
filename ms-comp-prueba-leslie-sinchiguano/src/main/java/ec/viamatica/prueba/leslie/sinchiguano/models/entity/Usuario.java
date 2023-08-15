package ec.viamatica.prueba.leslie.sinchiguano.models.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Table(name="usuario")
@Data
@AllArgsConstructor
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_usuario")
	private int idUsuario;
	
	@NotEmpty
	@Column(name="nombre_usuario", nullable = false, unique = true, length = 50)
	private String nombreUsuario;
	
	@NotEmpty
	@Column(name="pass_usuario", nullable = false, length = 50)
	private String passUsuario;
	
	@NotEmpty
	@Column(name="sactiva_usuario", nullable = false, length = 1)
	private String sessionUsuario;

	@NotEmpty
	@ManyToOne
	@JoinColumn(name="id_persona")
	private Persona persona;
	
	@NotEmpty
	@Column(name="email_usuario", length = 120)
	private String emailUsuario = "info@viamatica.com.ec";
	
	@Column(name="estado_usuario", nullable = false, length = 20)
	private String estadoUsuario = "activo";
	
	@NotEmpty
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="rol_usuario",
        joinColumns = @JoinColumn(name="id_usuario", referencedColumnName="id_usuario"),
        inverseJoinColumns = @JoinColumn(name="id_rol", referencedColumnName="id_rol")
    )
    private List<Rol> rol;
}
