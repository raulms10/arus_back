package co.com.adn.dominio.excepcion;

/**
 * @author raul.martinez
 */
public class ExcepcionValorObligatorio extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ExcepcionValorObligatorio(String message) {
        super(message);
    }
}
