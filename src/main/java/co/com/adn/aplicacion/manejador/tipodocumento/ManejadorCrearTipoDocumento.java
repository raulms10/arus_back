package co.com.adn.aplicacion.manejador.tipodocumento;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoTipoDocumento;
import co.com.adn.aplicacion.fabrica.FabricaTipoDocumento;
import co.com.adn.dominio.modelo.TipoDocumento;
import co.com.adn.dominio.servicio.tipodocumento.ServicioCrearTipoDocumento;

@Component
public class ManejadorCrearTipoDocumento {
	
	private final ServicioCrearTipoDocumento servicioCrearTipoDocumento;
	private final FabricaTipoDocumento fabricaTipoDocumento;
	
	public ManejadorCrearTipoDocumento(ServicioCrearTipoDocumento servicioCrearTipoDocumento,
			FabricaTipoDocumento fabricaTipoDocumento) {
		this.servicioCrearTipoDocumento = servicioCrearTipoDocumento;
		this.fabricaTipoDocumento = fabricaTipoDocumento;
	}
	
	public void ejecutar(ComandoTipoDocumento comandoTipoDocumento) {
		TipoDocumento tipoDocumento = this.fabricaTipoDocumento.crearTipoDocumento(comandoTipoDocumento);
		this.servicioCrearTipoDocumento.ejecutar(tipoDocumento);
	}

}
