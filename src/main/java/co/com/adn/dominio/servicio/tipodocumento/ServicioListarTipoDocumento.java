package co.com.adn.dominio.servicio.tipodocumento;

import java.util.List;

import co.com.adn.aplicacion.comando.ComandoTipoDocumento;
import co.com.adn.dominio.repositorio.RepositorioTipoDocumento;

public class ServicioListarTipoDocumento {

	private RepositorioTipoDocumento repositorioTipoDocumento;

	public ServicioListarTipoDocumento(RepositorioTipoDocumento repositorioTipoDocumento) {
		this.repositorioTipoDocumento = repositorioTipoDocumento;
	}
	
	public List<ComandoTipoDocumento> listar() {
		return this.repositorioTipoDocumento.listar();
	}
}
