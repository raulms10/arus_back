package co.com.adn.aplicacion.fabrica;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAfiliado;
import co.com.adn.dominio.modelo.Afiliado;
import co.com.adn.dominio.modelo.TipoDocumento;

@Component
public class FabricaAfiliado {

	private final FabricaTipoDocumento fabricaTipoDocumento;

	public FabricaAfiliado(FabricaTipoDocumento fabricaTipoDocumento) {
		this.fabricaTipoDocumento = fabricaTipoDocumento;
	}

	public Afiliado crearAfiliado(ComandoAfiliado comandoAfiliado) {
		TipoDocumento tipoDocumento = this.fabricaTipoDocumento.crearTipoDocumento(comandoAfiliado.getTipoDocumento());
		return new Afiliado(tipoDocumento, comandoAfiliado.getNumeroDocumento(), comandoAfiliado.getPrimerNombre(),
				comandoAfiliado.getSegundoNombre(), comandoAfiliado.getPrimerApellido(),
				comandoAfiliado.getSegundoApellido());
	}
}
