package com.adn.arus.dominio.testdatabuilder;

import co.com.adn.dominio.modelo.AdministradoraSalud;

public class AdministradoraSaludTestDataBuilder {
	
	private String codigo;
	private String nombre;
	
	public AdministradoraSaludTestDataBuilder() {
		this.codigo = "EPS001";
		this.nombre = "Sanitas EPS";
	}
	
	public AdministradoraSaludTestDataBuilder conCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public AdministradoraSaludTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public AdministradoraSalud build() {
		return new AdministradoraSalud(codigo, nombre);
	}
}
