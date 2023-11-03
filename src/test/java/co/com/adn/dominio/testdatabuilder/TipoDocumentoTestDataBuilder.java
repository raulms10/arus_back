package co.com.adn.dominio.testdatabuilder;

import co.com.adn.dominio.modelo.TipoDocumento;

public class TipoDocumentoTestDataBuilder {

	private String codigo;
	private String nombre;
	
	public TipoDocumentoTestDataBuilder() {
		this.codigo = "CC";
		this.nombre = "Cédula";
	}
	
	public TipoDocumentoTestDataBuilder conCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public TipoDocumentoTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public TipoDocumento build() {
		return new TipoDocumento(codigo, nombre);
	}
}
