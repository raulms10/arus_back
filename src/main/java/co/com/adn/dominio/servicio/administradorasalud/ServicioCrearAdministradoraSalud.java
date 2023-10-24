package co.com.adn.dominio.servicio.administradorasalud;

import co.com.adn.dominio.modelo.AdministradoraSalud;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraSalud;

/**
 * @author raul.martinez
 */
public class ServicioCrearAdministradoraSalud {
	
	private RepositorioAdministradoraSalud repositorioAdministradoraSalud;

	public ServicioCrearAdministradoraSalud(RepositorioAdministradoraSalud repositorioAdministradoraSalud) {
		this.repositorioAdministradoraSalud = repositorioAdministradoraSalud;
	}
	
	public void ejecutar(AdministradoraSalud administradoraSalud) {
		this.repositorioAdministradoraSalud.crear(administradoraSalud);
	}

}
