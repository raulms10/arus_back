package co.com.adn.dominio.servicio.afiliado;

import co.com.adn.dominio.modelo.Afiliado;
import co.com.adn.dominio.repositorio.RepositorioAfiliado;
import co.com.adn.dominio.validador.ValidadorTipoYNumeroDocumento;

/**
 * @author raul.martinez
 */
public class ServicioCrearAfiliado {
	
	private RepositorioAfiliado repositorioAfliliado;

	public ServicioCrearAfiliado(RepositorioAfiliado repositorioAfliliado) {
		this.repositorioAfliliado = repositorioAfliliado;
	}

	public void ejecutar(Afiliado afiliado) {
		validarTipoYNumeroDocumento(afiliado.getTipoDocumento().getCodigo(), afiliado.getNumeroDocumento());
		this.repositorioAfliliado.crear(afiliado);
	}
	
	private void validarTipoYNumeroDocumento(String tipoDocumento, String numeroDocumento) {
		ValidadorTipoYNumeroDocumento.validarTipoYNumeroDocumento(tipoDocumento, numeroDocumento, numeroDocumento);
	}
}
