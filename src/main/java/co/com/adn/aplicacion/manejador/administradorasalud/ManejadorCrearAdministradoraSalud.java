package co.com.adn.aplicacion.manejador.administradorasalud;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.aplicacion.fabrica.FabricaAdministradoraSalud;
import co.com.adn.dominio.modelo.AdministradoraSalud;
import co.com.adn.dominio.servicio.administradorasalud.ServicioCrearAdministradoraSalud;

@Component
public class ManejadorCrearAdministradoraSalud {
	
	private final ServicioCrearAdministradoraSalud servicioCrearAdministradoraSalud;
	private final FabricaAdministradoraSalud fabricaAdministradoraSalud;
	
	public ManejadorCrearAdministradoraSalud(ServicioCrearAdministradoraSalud servicioCrearAdministradoraSalud,
			FabricaAdministradoraSalud fabricaAdministradoraSalud) {
		this.servicioCrearAdministradoraSalud = servicioCrearAdministradoraSalud;
		this.fabricaAdministradoraSalud = fabricaAdministradoraSalud;
	}
	
	public void ejecutar(ComandoAdministradoraSalud comandoAdministradoraSalud) {
		AdministradoraSalud administradoraSalud = this.fabricaAdministradoraSalud.crearAdministradoraSalud(comandoAdministradoraSalud);
		this.servicioCrearAdministradoraSalud.ejecutar(administradoraSalud);
	}
}
