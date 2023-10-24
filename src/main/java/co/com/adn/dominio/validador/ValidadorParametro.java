package co.com.adn.dominio.validador;

import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;

/**
 * @author raul.martinez
 */
public final class ValidadorParametro {
	
	private ValidadorParametro() {}
	
	public static void validarObligatorio(Object valor, String mensaje) {
        if (valor == null) {
            throw new ExcepcionValorObligatorio(mensaje);
        }
    }
}
