package co.com.adn.dominio.excepcion;

/**
 * @author raul.martinez
 */
public class ExcepcionTipoYNumeroDocumento extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ExcepcionTipoYNumeroDocumento(String message) {
        super(message);
    }
}
