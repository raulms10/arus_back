package co.com.adn.infraestructura.testdatabuilder;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;

public class ComandoAdministradoraPensionTestDataBuilder {

	private String codigo;
	private String nombre;
	
	public ComandoAdministradoraPensionTestDataBuilder() {
		this.codigo = "AFP001";
		this.nombre = "Protección";
	}
	
	public ComandoAdministradoraPensionTestDataBuilder conCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public ComandoAdministradoraPensionTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ComandoAdministradoraPension build() {
		return new ComandoAdministradoraPension(codigo, nombre);
	}
	
	
}
