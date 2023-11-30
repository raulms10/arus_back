package co.com.adn.dominio.excepcion;

/**
 * @author raul.martinez
 */
public class ExcepcionReglaDroolsAfiliacion extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ExcepcionReglaDroolsAfiliacion(String message) {
        super(message);
    }
}
