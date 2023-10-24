package co.com.adn.dominio.modelo;

import co.com.adn.dominio.validador.ValidadorParametro;

/**
 * @author raul.martinez
 */
public class AdministradoraPension {
	
	private static final String EL_CODIGO_ES_DATO_OBLIGATORIO = "El código de la Adminsitradora de Pensión es un dato obligatorio.";
	private static final String EL_NOMBRE_ES_DATO_OBLIGATORIO = "El nombre de la Adminsitradora de Pensión es un dato obligatorio.";
	
	private String codigo;
	private String nombre;
	
	public AdministradoraPension(String codigo, String nombre) {
		//Se valida datos obligatorios
		ValidadorParametro.validarObligatorio(codigo, EL_CODIGO_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(nombre, EL_NOMBRE_ES_DATO_OBLIGATORIO);
		
		//Se crea la Administradora de Pension
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
