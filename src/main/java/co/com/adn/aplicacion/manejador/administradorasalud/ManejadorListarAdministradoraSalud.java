package co.com.adn.aplicacion.manejador.administradorasalud;

import java.util.List;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.dominio.servicio.administradorasalud.ServicioListarAdministradorasSalud;

@Component
public class ManejadorListarAdministradoraSalud {
	
	private final ServicioListarAdministradorasSalud servicioListarAdministradorasSalud;

	public ManejadorListarAdministradoraSalud(ServicioListarAdministradorasSalud servicioListarAdministradorasSalud) {
		this.servicioListarAdministradorasSalud = servicioListarAdministradorasSalud;
	}

	public List<ComandoAdministradoraSalud> listar() {
		return this.servicioListarAdministradorasSalud.listar();
	}
	
}
