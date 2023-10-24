package co.com.adn.aplicacion.fabrica;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.dominio.modelo.AdministradoraSalud;

@Component
public class FabricaAdministradoraSalud {

	public AdministradoraSalud crearAdministradoraSalud(ComandoAdministradoraSalud comandoAdministradoraSalud) {
		return new AdministradoraSalud(comandoAdministradoraSalud.getCodigo(), comandoAdministradoraSalud.getNombre());
	}
}
