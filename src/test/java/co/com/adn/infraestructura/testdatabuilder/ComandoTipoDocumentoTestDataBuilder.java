package co.com.adn.infraestructura.testdatabuilder;

import co.com.adn.aplicacion.comando.ComandoTipoDocumento;

public class ComandoTipoDocumentoTestDataBuilder {

	private String codigo;
	private String nombre;
	
	public ComandoTipoDocumentoTestDataBuilder() {
		this.codigo = "CC";
		this.nombre = "Cédula";
	}
	
	public ComandoTipoDocumentoTestDataBuilder conCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public ComandoTipoDocumentoTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ComandoTipoDocumento build() {
		return new ComandoTipoDocumento(codigo, nombre);
	}
}
