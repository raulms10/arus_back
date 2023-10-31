package com.adn.arus.dominio.entidad.testdatabuilder;

import co.com.adn.dominio.modelo.AdministradoraPension;

public class AdministradoraPensionTestDataBuilder {

	private String codigo;
	private String nombre;
	
	public AdministradoraPensionTestDataBuilder() {
		this.codigo = "AFP001";
		this.nombre = "Protección";
	}
	
	public AdministradoraPensionTestDataBuilder conCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public AdministradoraPensionTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public AdministradoraPension build() {
		return new AdministradoraPension(codigo, nombre);
	}
}
