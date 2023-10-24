package co.com.adn.aplicacion.manejador.administradorapension;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.aplicacion.fabrica.FabricaAdministradoraPension;
import co.com.adn.dominio.modelo.AdministradoraPension;
import co.com.adn.dominio.servicio.administradorapension.ServicioCrearAdministradoraPension;

@Component
public class ManejadorCrearAdministradoraPension {

	private final ServicioCrearAdministradoraPension servicioCrearAdministradoraPension;
	private final FabricaAdministradoraPension fabricaAdministradoraPension;
	
	public ManejadorCrearAdministradoraPension(ServicioCrearAdministradoraPension servicioCrearAdministradoraPension,
			FabricaAdministradoraPension fabricaAdministradoraPension) {
		this.servicioCrearAdministradoraPension = servicioCrearAdministradoraPension;
		this.fabricaAdministradoraPension = fabricaAdministradoraPension;
	}
	
	public void ejecutar(ComandoAdministradoraPension comandoAdministradoraPension) {
		AdministradoraPension administradoraPension = this.fabricaAdministradoraPension.crearAdministradoraPension(comandoAdministradoraPension);
		this.servicioCrearAdministradoraPension.ejecutar(administradoraPension);
	}
}
