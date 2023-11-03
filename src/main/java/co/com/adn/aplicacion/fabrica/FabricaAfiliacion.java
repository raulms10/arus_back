package co.com.adn.aplicacion.fabrica;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.dominio.modelo.AdministradoraPension;
import co.com.adn.dominio.modelo.AdministradoraSalud;
import co.com.adn.dominio.modelo.Afiliacion;
import co.com.adn.dominio.modelo.Afiliado;
import co.com.adn.dominio.validador.ValidadorParametro;

@Component
public class FabricaAfiliacion {
	
	private static final String EL_AFILIADO_ES_DATO_OBLIGATORIO = "El Afiliado es un dato obligatorio.";
	private static final String LA_ADMINISTRADORA_SALUD_ES_DATO_OBLIGATORIO = "La Administradora de Salud es un dato obligatorio.";
	private static final String LA_ADMINISTRADORA_PENSION_ES_DATO_OBLIGATORIO = "La Administradora de Pensión es un dato obligatorio.";
	
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
		
		ValidadorParametro.validarObligatorio(comandoAfiliacion.getAfiliado(), EL_AFILIADO_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(comandoAfiliacion.getAdministradoraSalud(), LA_ADMINISTRADORA_SALUD_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(comandoAfiliacion.getAdministradoraPension(), LA_ADMINISTRADORA_PENSION_ES_DATO_OBLIGATORIO);
		
		Afiliado afiliado = this.fabricaAfiliado.crearAfiliado(comandoAfiliacion.getAfiliado());
		AdministradoraSalud administradoraSalud = this.fabricaAdministradoraSalud.crearAdministradoraSalud(comandoAfiliacion.getAdministradoraSalud());
		AdministradoraPension administradoraPension = this.fabricaAdministradoraPension.crearAdministradoraPension(comandoAfiliacion.getAdministradoraPension());
		return new Afiliacion(afiliado, administradoraSalud, comandoAfiliacion.getFechaAfiliacionSalud(), administradoraPension, comandoAfiliacion.getFechaAfiliacionPension());
	}
}
