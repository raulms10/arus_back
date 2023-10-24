package co.com.adn.aplicacion.comando;

import java.util.Date;

public class ComandoAfiliacion {

	private ComandoAfiliado afiliado;
	private ComandoAdministradoraSalud administradoraSalud;
	private Date fechaAfiliacionSalud;
	private ComandoAdministradoraPension administradoraPension;
	private Date fechaAfiliacionPension;

	public ComandoAfiliacion(ComandoAfiliado afiliado, ComandoAdministradoraSalud administradoraSalud,
			Date fechaAfiliacionSalud, ComandoAdministradoraPension administradoraPension,
			Date fechaAfiliacionPension) {
		this.afiliado = afiliado;
		this.administradoraSalud = administradoraSalud;
		this.fechaAfiliacionSalud = fechaAfiliacionSalud;
		this.administradoraPension = administradoraPension;
		this.fechaAfiliacionPension = fechaAfiliacionPension;
	}

	public ComandoAfiliacion() { }

	public ComandoAfiliado getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(ComandoAfiliado afiliado) {
		this.afiliado = afiliado;
	}

	public ComandoAdministradoraSalud getAdministradoraSalud() {
		return administradoraSalud;
	}

	public void setAdministradoraSalud(ComandoAdministradoraSalud administradoraSalud) {
		this.administradoraSalud = administradoraSalud;
	}

	public Date getFechaAfiliacionSalud() {
		return fechaAfiliacionSalud;
	}

	public void setFechaAfiliacionSalud(Date fechaAfiliacionSalud) {
		this.fechaAfiliacionSalud = fechaAfiliacionSalud;
	}

	public ComandoAdministradoraPension getAdministradoraPension() {
		return administradoraPension;
	}

	public void setAdministradoraPension(ComandoAdministradoraPension administradoraPension) {
		this.administradoraPension = administradoraPension;
	}

	public Date getFechaAfiliacionPension() {
		return fechaAfiliacionPension;
	}

	public void setFechaAfiliacionPension(Date fechaAfiliacionPension) {
		this.fechaAfiliacionPension = fechaAfiliacionPension;
	}
}
