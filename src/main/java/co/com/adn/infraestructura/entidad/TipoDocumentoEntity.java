package co.com.adn.infraestructura.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Getter;
//import lombok.Setter;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumentoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo")
	private String codigo;

	@Column(name = "nombre")
	private String nombre;
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "TipoDocumentoEntityModel [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
}
