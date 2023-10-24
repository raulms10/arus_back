package co.com.adn.dominio.repositorio;

import java.util.List;

import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.dominio.modelo.AdministradoraSalud;

/**
 * @author raul.martinez
 */
public interface RepositorioAdministradoraSalud {
	
	/**
	 * Permite crear las Administradoras de Salud
	 * @param AdministradoraSalud
	 */
	void crear(AdministradoraSalud administradoraSalud);
	
	/**
	 * Permite consultar las Administradores de Salud para utilizarlas en listas desplegables
	 * @return Administradoras de Salud
	 */
	List<ComandoAdministradoraSalud> listar();
}
