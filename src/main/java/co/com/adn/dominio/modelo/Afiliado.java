package co.com.adn.dominio.modelo;

import co.com.adn.dominio.validador.ValidadorParametro;

/**
 * @author raul.martinez
 */
public class Afiliado {
	
	private static final String EL_TIPO_DOCUMENTO_ES_DATO_OBLIGATORIO = "El tipo de documento del Afiliado es un dato obligatorio.";
	private static final String EL_NUMERO_DOCUMENTO_ES_DATO_OBLIGATORIO = "El número de documento del Afiliado es un dato obligatorio.";
	private static final String EL_PRIMER_NOMBRE_ES_DATO_OBLIGATORIO = "El primer nombre del Afiliado es un dato obligatorio.";
	private static final String EL_PRIMER_APELLIDO_ES_DATO_OBLIGATORIO = "El primer apellido del Afiliado es un dato obligatorio.";
	
	private TipoDocumento tipoDocumento;
	private String numeroDocumento;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	
	public Afiliado(TipoDocumento tipoDocumento, String numeroDocumento, String primerNombre, String segundoNombre,
			String primerApellido, String segundoApellido) {
		//Se valida datos obligatorios
		ValidadorParametro.validarObligatorio(tipoDocumento, EL_TIPO_DOCUMENTO_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(numeroDocumento, EL_NUMERO_DOCUMENTO_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(primerNombre, EL_PRIMER_NOMBRE_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(primerApellido, EL_PRIMER_APELLIDO_ES_DATO_OBLIGATORIO);
		
		//Se crea el Afiliado
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
}
