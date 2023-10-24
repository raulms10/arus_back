package co.com.adn.aplicacion.fabrica;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.dominio.modelo.AdministradoraPension;
import co.com.adn.dominio.modelo.AdministradoraSalud;
import co.com.adn.dominio.modelo.Afiliacion;
import co.com.adn.dominio.modelo.Afiliado;

@Component
public class FabricaAfiliacion {
	
	private final FabricaAfiliado fabricaAfiliado;
	private final FabricaAdministradoraSalud fabricaAdministradoraSalud;
	private final FabricaAdministradoraPension fabricaAdministradoraPension;
	
	public FabricaAfiliacion(FabricaAfiliado fabricaAfiliado, FabricaAdministradoraSalud fabricaAdministradoraSalud,
			FabricaAdministradoraPension fabricaAdministradoraPension) {
		this.fabricaAfiliado = fabricaAfiliado;
		this.fabricaAdministradoraSalud = fabricaAdministradoraSalud;
		this.fabricaAdministradoraPension = fabricaAdministradoraPension;
	}

	public Afiliacion crearAfiliacion(ComandoAfiliacion comandoAfiliacion) {
		Afiliado afiliado = this.fabricaAfiliado.crearAfiliado(comandoAfiliacion.getAfiliado());
		AdministradoraSalud administradoraSalud = this.fabricaAdministradoraSalud.crearAdministradoraSalud(comandoAfiliacion.getAdministradoraSalud());
		AdministradoraPension administradoraPension = this.fabricaAdministradoraPension.crearAdministradoraPension(comandoAfiliacion.getAdministradoraPension());
		return new Afiliacion(afiliado, administradoraSalud, comandoAfiliacion.getFechaAfiliacionSalud(), administradoraPension, comandoAfiliacion.getFechaAfiliacionPension());
	}
}
