package co.com.adn.dominio.modelo;

import co.com.adn.dominio.validador.ValidadorParametro;

/**
 * @author raul.martinez
 */
public class AdministradoraSalud {
	
	private static final String EL_CODIGO_ES_DATO_OBLIGATORIO = "El código de la Administradora de Salud es un dato obligatorio.";
	private static final String EL_NOMBRE_ES_DATO_OBLIGATORIO = "El nombre de la Administradora de Salud es un dato obligatorio.";
		
	private String codigo;
	private String nombre;
	
	public AdministradoraSalud(String codigo, String nombre) {
		//Se valida datos obligatorios
		ValidadorParametro.validarObligatorio(codigo, EL_CODIGO_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(nombre, EL_NOMBRE_ES_DATO_OBLIGATORIO);
		
		//Se crea la Administradora de
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
