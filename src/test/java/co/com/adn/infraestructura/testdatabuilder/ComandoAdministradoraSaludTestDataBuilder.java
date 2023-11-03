package co.com.adn.infraestructura.testdatabuilder;

import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;

public class ComandoAdministradoraSaludTestDataBuilder {

	private String codigo;
	private String nombre;
	
	public ComandoAdministradoraSaludTestDataBuilder() {
		this.codigo = "EPS001";
		this.nombre = "Sanitas EPS";
	}
	
	public ComandoAdministradoraSaludTestDataBuilder conCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public ComandoAdministradoraSaludTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ComandoAdministradoraSalud build() {
		return new ComandoAdministradoraSalud(codigo, nombre);
	}
}
