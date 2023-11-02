package co.com.adn.infraestructura.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import lombok.Getter;
//import lombok.Setter;

@Entity
@Table(name = "afiliacion")
//@Getter
//@Setter
public class AfiliacionEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo")
	private String codigo;
	
	@OneToOne
	@JoinColumn(name = "afiliado", referencedColumnName = "codigo", nullable = false)
	private AfiliadoEntity afiliado;
	
	@OneToOne
	@JoinColumn(name = "administradora_salud", referencedColumnName = "codigo", nullable = false)
	private AdministradoraSaludEntity administradoraSalud;
	
	@Column(name = "fecha_afiliacion_salud")
	private Date fechaAfiliacionSalud;
	
	@OneToOne
	@JoinColumn(name = "administradora_pension", referencedColumnName = "codigo", nullable = false)
	private AdministradoraPensionEntity administradoraPension;
	
	@Column(name = "fecha_afiliacion_pension")
	private Date fechaAfiliacionPension;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public AfiliadoEntity getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(AfiliadoEntity afiliado) {
		this.afiliado = afiliado;
	}

	public AdministradoraSaludEntity getAdministradoraSalud() {
		return administradoraSalud;
	}

	public void setAdministradoraSalud(AdministradoraSaludEntity administradoraSalud) {
		this.administradoraSalud = administradoraSalud;
	}

	public Date getFechaAfiliacionSalud() {
		return fechaAfiliacionSalud;
	}

	public void setFechaAfiliacionSalud(Date fechaAfiliacionSalud) {
		this.fechaAfiliacionSalud = fechaAfiliacionSalud;
	}

	public AdministradoraPensionEntity getAdministradoraPension() {
		return administradoraPension;
	}

	public void setAdministradoraPension(AdministradoraPensionEntity administradoraPension) {
		this.administradoraPension = administradoraPension;
	}

	public Date getFechaAfiliacionPension() {
		return fechaAfiliacionPension;
	}

	public void setFechaAfiliacionPension(Date fechaAfiliacionPension) {
		this.fechaAfiliacionPension = fechaAfiliacionPension;
	}
}
