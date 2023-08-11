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
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="rol")
@Data
@AllArgsConstructor
public class Rol {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_rol")
	private int idRol;
	
	@NotEmpty
	@Column(name="nombre_rol", unique = true, length = 50, nullable = false)
	private String nombreRol;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="rol_rol_opciones",
        joinColumns = @JoinColumn(name="id_rol", referencedColumnName="id_rol"),
        inverseJoinColumns = @JoinColumn(name="id_rol_opciones", referencedColumnName="id_rol_opciones")
    )
    private List<Rol_Opciones> rol_opcion;
}
