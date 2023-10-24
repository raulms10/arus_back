package co.com.adn.dominio.servicio.administradorapension;

import java.util.List;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraPension;

public class ServicioListarAdministradoraPension {

	private RepositorioAdministradoraPension repositorioAdministradoraPension;

	public ServicioListarAdministradoraPension(RepositorioAdministradoraPension repositorioAdministradoraPension) {
		this.repositorioAdministradoraPension = repositorioAdministradoraPension;
	}
	
	public List<ComandoAdministradoraPension> listar() {
		return this.repositorioAdministradoraPension.listar();
	}
}
