package co.com.adn.infraestructura.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "afiliado")
@Getter
@Setter
public class AfiliadoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo")
	private String numeroDocumento;
	
	@OneToOne
	@JoinColumn(name = "tipo_documento", referencedColumnName = "codigo", nullable = false)
	private TipoDocumentoEntity tipoDocumento;
	
	@Column(name = "primer_nombre")
	private String primerNombre;
	
	@Column(name = "segundo_nombre")
	private String segundoNombre;
	
	@Column(name = "primer_apellido")
	private String primerApellido;
	
	@Column(name = "segundo_apellido")
	private String segundoApellido;
}
