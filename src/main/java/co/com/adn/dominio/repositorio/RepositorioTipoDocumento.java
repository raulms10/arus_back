package co.com.adn.dominio.repositorio;

import java.util.List;

import co.com.adn.aplicacion.comando.ComandoTipoDocumento;
import co.com.adn.dominio.modelo.TipoDocumento;

/**
 * @author raul.martinez
 */
public interface RepositorioTipoDocumento {

	/**
	 * Permite crear los Tipo de documentos
	 * @param TipoDocumento
	 */
	void crear(TipoDocumento tipoDocumento);
	
	/**
	 * Permite consultar los Tipos de documento para utilizarlos en listas desplegables
	 * @return Tipos docuementos
	 */
	List<ComandoTipoDocumento> listar();
}
