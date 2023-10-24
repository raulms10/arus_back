package co.com.adn.dominio.servicio.afiliacion;

import java.util.List;

import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.dominio.repositorio.RepositorioAfiliacion;

public class ServicioListarAfiliacion {
	
	private RepositorioAfiliacion repositorioAfiliacion;

	public ServicioListarAfiliacion(RepositorioAfiliacion repositorioAfiliacion) {
		this.repositorioAfiliacion = repositorioAfiliacion;
	}
	
	public List<ComandoAfiliacion> listar() {
		return this.repositorioAfiliacion.listar();
	}
}
