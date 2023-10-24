package co.com.adn.aplicacion.manejador.tipodocumento;

import java.util.List;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoTipoDocumento;
import co.com.adn.dominio.servicio.tipodocumento.ServicioListarTipoDocumento;

@Component
public class ManejadorListarTipoDocumento {

	private final ServicioListarTipoDocumento servicioListarTipoDocumento;

	public ManejadorListarTipoDocumento(ServicioListarTipoDocumento servicioListarTipoDocumento) {
		this.servicioListarTipoDocumento = servicioListarTipoDocumento;
	}
	
	public List<ComandoTipoDocumento> listar() {
		return this.servicioListarTipoDocumento.listar();
	}
}
