package com.adn.arus.dominio.entidad.testdatabuilder;

import java.util.Date;

import co.com.adn.dominio.modelo.AdministradoraPension;
import co.com.adn.dominio.modelo.AdministradoraSalud;
import co.com.adn.dominio.modelo.Afiliacion;
import co.com.adn.dominio.modelo.Afiliado;

public class AfiliacionTestDataBuilder {

	private Afiliado afiliado;
	private AdministradoraSalud administradoraSalud;
	private Date fechaAfiliacionSalud;
	private AdministradoraPension administradoraPension;
	private Date fechaAfiliacionPension;
	
	public AfiliacionTestDataBuilder() {
		this.afiliado = new AfiliadoTestDataBuilder().build();
		this.administradoraSalud = new AdministradoraSaludTestDataBuilder().build();
		this.fechaAfiliacionSalud = new Date();
		this.administradoraPension = new AdministradoraPensionTestDataBuilder().build();
		this.fechaAfiliacionPension = new Date();
	}
	
	public AfiliacionTestDataBuilder conAfiliado(Afiliado afiliado) {
		this.afiliado = afiliado;
		return this;
	}
	
	public AfiliacionTestDataBuilder conAdministradoraSalud(AdministradoraSalud administradoraSalud) {
		this.administradoraSalud = administradoraSalud;
		return this;
	}
	
	public AfiliacionTestDataBuilder conFechaAfiliacionSalud(Date fechaAfiliacionSalud) {
		this.fechaAfiliacionSalud = fechaAfiliacionSalud;
		return this;
	}
	
	public AfiliacionTestDataBuilder conAdministradoraPension(AdministradoraPension administradoraPension) {
		this.administradoraPension = administradoraPension;
		return this;
	}
	
	public AfiliacionTestDataBuilder conFechaAfiliacionPension(Date fechaAfiliacionPension) {
		this.fechaAfiliacionPension = fechaAfiliacionPension;
		return this;
	}
	
	public Afiliacion build() {
		return new Afiliacion(afiliado, administradoraSalud, fechaAfiliacionSalud, administradoraPension, fechaAfiliacionPension);
	}
}
