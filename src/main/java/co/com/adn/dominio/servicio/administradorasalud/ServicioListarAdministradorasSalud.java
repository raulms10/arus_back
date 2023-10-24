package co.com.adn.dominio.servicio.administradorasalud;

import java.util.List;

import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraSalud;

public class ServicioListarAdministradorasSalud {

	private RepositorioAdministradoraSalud repositorioAdministradoraSalud;

	public ServicioListarAdministradorasSalud(RepositorioAdministradoraSalud repositorioAdministradoraSalud) {
		this.repositorioAdministradoraSalud = repositorioAdministradoraSalud;
	}
	
	public List<ComandoAdministradoraSalud> listar() {
		return this.repositorioAdministradoraSalud.listar();
	}
}
