package co.com.adn.dominio.servicio.afiliacion;

import co.com.adn.dominio.modelo.Afiliacion;
import co.com.adn.dominio.repositorio.RepositorioAfiliacion;

/**
 * @author raul.martinez
 */
public class ServicioCrearAfiliacion {

	private RepositorioAfiliacion repositorioAfiliacion;

	public ServicioCrearAfiliacion(RepositorioAfiliacion repositorioAfiliacion) {
		this.repositorioAfiliacion = repositorioAfiliacion;
	}
	
	public void ejecutar(Afiliacion afiliacion) {
		this.repositorioAfiliacion.crear(afiliacion);
	}
}
