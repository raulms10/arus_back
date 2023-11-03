package com.adn.arus.dominio.testdatabuilder;

import co.com.adn.dominio.modelo.Afiliado;
import co.com.adn.dominio.modelo.TipoDocumento;

public class AfiliadoTestDataBuilder {

	private TipoDocumento tipoDocumento;
	private String numeroDocumento;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	
	public AfiliadoTestDataBuilder() {
		this.tipoDocumento = new TipoDocumentoTestDataBuilder().build();
		this.numeroDocumento = "12345";
		this.primerNombre = "Atonogena";
		this.segundoNombre = "Rucutunda";
		this.primerApellido = "Meneses";
		this.segundoApellido = "Trespalacios";
	}
	
	public AfiliadoTestDataBuilder conTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
		return this;
	}
	
	public AfiliadoTestDataBuilder conNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
		return this;
	}
	
	public AfiliadoTestDataBuilder conPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
		return this;
	}
	
	public AfiliadoTestDataBuilder conSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
		return this;
	}
	
	public AfiliadoTestDataBuilder conPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
		return this;
	}
	
	public AfiliadoTestDataBuilder conSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
		return this;
	}
	
	public Afiliado build() {
		return new Afiliado(tipoDocumento, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido);
	}
}
