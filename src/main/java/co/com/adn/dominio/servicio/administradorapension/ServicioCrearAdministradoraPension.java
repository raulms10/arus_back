/**
 * 
 */
package co.com.adn.dominio.servicio.administradorapension;

import co.com.adn.dominio.modelo.AdministradoraPension;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraPension;

/**
 * @author raul.martinez
 */
public class ServicioCrearAdministradoraPension {
	
	private RepositorioAdministradoraPension repositorioAdministradoraPension;

	public ServicioCrearAdministradoraPension(RepositorioAdministradoraPension repositorioAdministradoraPension) {
		this.repositorioAdministradoraPension = repositorioAdministradoraPension;
	}
	
	public void ejecutar(AdministradoraPension administradoraPension) {
		this.repositorioAdministradoraPension.crear(administradoraPension);
	}

}
