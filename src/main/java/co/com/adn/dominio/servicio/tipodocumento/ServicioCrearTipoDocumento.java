package co.com.adn.dominio.servicio.tipodocumento;

import co.com.adn.dominio.modelo.TipoDocumento;
import co.com.adn.dominio.repositorio.RepositorioTipoDocumento;

/**
 * @author raul.martinez
 */
public class ServicioCrearTipoDocumento {
	
	private RepositorioTipoDocumento repositorioTipoDocumento;

	public ServicioCrearTipoDocumento(RepositorioTipoDocumento repositorioTipoDocumento) {
		this.repositorioTipoDocumento = repositorioTipoDocumento;
	}
	
	public void ejecutar(TipoDocumento tipoDocumento) {
		this.repositorioTipoDocumento.crear(tipoDocumento);
	}
}
