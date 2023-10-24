package co.com.adn.infraestructura.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "administradora_salud")
@Getter
@Setter
public class AdministradoraSaludEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo")
	private String codigo;

	@Column(name = "nombre")
	private String nombre;
}
