package com.adn.arus.infraestructura.testdatabuilder;

import co.com.adn.aplicacion.comando.ComandoAfiliado;
import co.com.adn.aplicacion.comando.ComandoTipoDocumento;

public class ComandoAfiliadoTestDataBuilder {

	private ComandoTipoDocumento comandoTipoDocumento;
	private String numeroDocumento;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	
	public ComandoAfiliadoTestDataBuilder() {
		this.comandoTipoDocumento = new ComandoTipoDocumentoTestDataBuilder().build();
		this.numeroDocumento = "12345";
		this.primerNombre = "Atonogena";
		this.segundoNombre = "Rucutunda";
		this.primerApellido = "Meneses";
		this.segundoApellido = "Trespalacios";
	}
	
	public ComandoAfiliadoTestDataBuilder conTipoDocumento(ComandoTipoDocumento comandoTipoDocumento) {
		this.comandoTipoDocumento = comandoTipoDocumento;
		return this;
	}
	
	public ComandoAfiliadoTestDataBuilder conNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
		return this;
	}
	
	public ComandoAfiliadoTestDataBuilder conPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
		return this;
	}
	
	public ComandoAfiliadoTestDataBuilder conSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
		return this;
	}
	
	public ComandoAfiliadoTestDataBuilder conPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
		return this;
	}
	
	public ComandoAfiliadoTestDataBuilder conSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
		return this;
	}
	
	public ComandoAfiliado build() {
		return new ComandoAfiliado(comandoTipoDocumento, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido);
	}
}
