package co.com.adn.dominio.validador;

import co.com.adn.dominio.excepcion.ExcepcionTipoYNumeroDocumento;

/**
 * @author raul.martinez
 */
public final class ValidadorTipoYNumeroDocumento {
	private static final String SOLO_10_DIGITOS_CON_CEDULA = "Para el tipo de documento 'Cédula', solo está permitido ingresar máximo 10 caracteres de tipo número";
	private static final String SOLO_14_DIGITOS_Y_LETRAS_CON_CEDULA_EXTRANJERIA = "Para el tipo de documento 'Cédula de extranjería', solo está permitido ingresar máximo 14 caracteres entre letras y números";
	private static final String SOLO_DIGITOS_CON_REGISTRO = "Para el tipo de documento 'Registro Civil', solo está permitido ingresar caracteres de tipo número";
	private static final String SOLO_DIGITOS_CON_TARJETA = "Para el tipo de documento 'Tarjeta de Identidad', solo está permitido ingresar caracteres de tipo número";
	
	private ValidadorTipoYNumeroDocumento() {}

	public static void validarTipoYNumeroDocumento(String tipoDocumento, String numeroDocumento, String mensaje) {
		if("CC".equals(tipoDocumento) && !numeroDocumento.matches("\\d{1,10}")) {
			throw new ExcepcionTipoYNumeroDocumento(SOLO_10_DIGITOS_CON_CEDULA);
		} else if ("CE".equals(tipoDocumento) && !numeroDocumento.matches("[0-9a-zA-ZñÑ]{1,14}")) {
			throw new ExcepcionTipoYNumeroDocumento(SOLO_14_DIGITOS_Y_LETRAS_CON_CEDULA_EXTRANJERIA);
		} else if ("RC".equals(tipoDocumento) && !numeroDocumento.matches("\\d*")) {
			throw new ExcepcionTipoYNumeroDocumento(SOLO_DIGITOS_CON_REGISTRO);
		} else if ("TI".equals(tipoDocumento) && !numeroDocumento.matches("\\d*")) {
			throw new ExcepcionTipoYNumeroDocumento(SOLO_DIGITOS_CON_TARJETA);
		}
	}
}
