package co.com.adn.dominio.modelo;

import co.com.adn.dominio.validador.ValidadorParametro;

/**
 * @author raul.martinez
 */
public class TipoDocumento {
	
	private static final String EL_CODIGO_ES_DATO_OBLIGATORIO = "El código del tipo de documento es un dato obligatorio.";
	private static final String EL_NOMBRE_ES_DATO_OBLIGATORIO = "El nombre del tipo de documento es un dato obligatorio.";
	
	private String codigo;
	private String nombre;
	
	public TipoDocumento(String codigo, String nombre) {
		//Se valida datos obligatorios
		ValidadorParametro.validarObligatorio(codigo, EL_CODIGO_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(nombre, EL_NOMBRE_ES_DATO_OBLIGATORIO);
		
		// Se crea el Tipo de documento
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
