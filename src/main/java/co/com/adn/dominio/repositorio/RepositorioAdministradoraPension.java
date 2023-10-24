package co.com.adn.dominio.repositorio;

import java.util.List;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.dominio.modelo.AdministradoraPension;

/**
 * @author raul.martinez
 */
public interface RepositorioAdministradoraPension {
	
	/**
	 * Permite crear las Administradoras de Pension
	 * @param AdministradoraPension
	 */
	void crear(AdministradoraPension administradoraPension);
	
	/**
	 * Permite consultar las Administradores de Pension para utilizarlas en listas desplegables
	 * @return Administradoras de Pension
	 */
	List<ComandoAdministradoraPension> listar();
}
