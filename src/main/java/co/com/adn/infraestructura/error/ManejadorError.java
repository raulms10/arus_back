package co.com.adn.infraestructura.error;

import java.util.concurrent.ConcurrentHashMap;

import org.drools.runtime.rule.ConsequenceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import co.com.adn.dominio.excepcion.ExcepcionTipoYNumeroDocumento;
import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;

@ControllerAdvice
public class ManejadorError {

	private static final Logger LOGGER = LoggerFactory.getLogger(ManejadorError.class);

    private static final String HA_OCURRIDO_ERROR_CONCTACTE_ADMINISTRADOR = "Ha ocurrido un error, por favor contactar al administrador.";

    private static final ConcurrentHashMap<String, Integer> CODIGOS_ESTADO = new ConcurrentHashMap<>();

    public ManejadorError() {
    	CODIGOS_ESTADO.put(ExcepcionValorObligatorio.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
    	CODIGOS_ESTADO.put(ExcepcionTipoYNumeroDocumento.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
    	CODIGOS_ESTADO.put(ConsequenceException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
    }
    
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Error> handleAllExceptions(Exception exception) {
    	ResponseEntity<Error> resultado;

        String excepcionNombre = exception.getClass().getSimpleName();
        String mensaje = exception.getCause() == null ? exception.getMessage() : exception.getCause().getMessage();
        Integer codigo = CODIGOS_ESTADO.get(excepcionNombre);

        if (codigo != null) {
            Error error = new Error(excepcionNombre, mensaje);
            resultado = new ResponseEntity<>(error, HttpStatus.valueOf(codigo));
        } else {
        	LOGGER.error(excepcionNombre, exception);
            Error error = new Error(excepcionNombre, HA_OCURRIDO_ERROR_CONCTACTE_ADMINISTRADOR);
            resultado = new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return resultado;
    }
}
