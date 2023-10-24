package co.com.adn.aplicacion.fabrica;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoTipoDocumento;
import co.com.adn.dominio.modelo.TipoDocumento;

@Component
public class FabricaTipoDocumento {

	public TipoDocumento crearTipoDocumento(ComandoTipoDocumento comandoTipoDocumento) {
		return new TipoDocumento(comandoTipoDocumento.getCodigo(), comandoTipoDocumento.getNombre());
	}
}
