package co.com.adn.aplicacion.fabrica;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.dominio.modelo.AdministradoraPension;

@Component
public class FabricaAdministradoraPension {

	public AdministradoraPension crearAdministradoraPension(ComandoAdministradoraPension comandoAdministradoraPension) {
		return new AdministradoraPension(comandoAdministradoraPension.getCodigo(),
				comandoAdministradoraPension.getNombre());
	}
}
