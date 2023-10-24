package co.com.adn.dominio.repositorio;

import java.util.List;

import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.dominio.modelo.Afiliacion;

/**
 * @author raul.martinez
 */
public interface RepositorioAfiliacion {
	/**
	 * Permite crear las Afiliacion
	 * @param afiliacion
	 */
	void crear(Afiliacion afiliacion);
	
	/**
	 * Permite verificar si ya se ha afiliado la persona
	 * @param afiliacion
	 * @return si existe o no
	 */
	boolean existe(Afiliacion afiliacion);
	
	/**
	 * Permite consultar la lista de Afiliaciones
	 * @return lista de afiliaciones
	 */
	List<ComandoAfiliacion> listar();
}
