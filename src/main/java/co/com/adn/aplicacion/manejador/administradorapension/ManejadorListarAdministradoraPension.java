package co.com.adn.aplicacion.manejador.administradorapension;

import java.util.List;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.dominio.servicio.administradorapension.ServicioListarAdministradoraPension;

@Component
public class ManejadorListarAdministradoraPension {

	private final ServicioListarAdministradoraPension servicioListarAdministradoraPension;

	public ManejadorListarAdministradoraPension(
			ServicioListarAdministradoraPension servicioListarAdministradoraPension) {
		this.servicioListarAdministradoraPension = servicioListarAdministradoraPension;
	}
	
	public List<ComandoAdministradoraPension> listar() {
		return this.servicioListarAdministradoraPension.listar();
	}
}
