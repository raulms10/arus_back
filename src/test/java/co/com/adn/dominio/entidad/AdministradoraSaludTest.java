package co.com.adn.dominio.entidad;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import co.com.adn.dominio.BasePrueba;
import co.com.adn.dominio.testdatabuilder.AdministradoraSaludTestDataBuilder;

import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;
import co.com.adn.dominio.modelo.AdministradoraSalud;

class AdministradoraSaludTest {
	
	private static final String EL_CODIGO_ES_DATO_OBLIGATORIO = "El código de la Administradora de Salud es un dato obligatorio.";
	private static final String EL_NOMBRE_ES_DATO_OBLIGATORIO = "El nombre de la Administradora de Salud es un dato obligatorio.";

	@Test
	void validarCrearAdministradoraSalud() {
		//Arrange
		AdministradoraSaludTestDataBuilder administradoraSaludTestDataBuilder = new AdministradoraSaludTestDataBuilder();
		//Act
		AdministradoraSalud administradoraSalud = administradoraSaludTestDataBuilder.build();
		//Assert
		Assert.assertNotNull(administradoraSalud);
		Assert.assertNotNull(administradoraSalud.getCodigo());
		Assert.assertNotNull(administradoraSalud.getNombre());
	}
	
	@Test
	void validarCodigoObligatorio() {
		//Arrange
		AdministradoraSaludTestDataBuilder administradoraSaludTestDataBuilder = new AdministradoraSaludTestDataBuilder();
		administradoraSaludTestDataBuilder.conCodigo(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> administradoraSaludTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_CODIGO_ES_DATO_OBLIGATORIO);
	}
	
	@Test
	void validarNombreObligatorio() {
		//Arrange
		AdministradoraSaludTestDataBuilder administradoraSaludTestDataBuilder = new AdministradoraSaludTestDataBuilder();
		administradoraSaludTestDataBuilder.conNombre(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> administradoraSaludTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_NOMBRE_ES_DATO_OBLIGATORIO);
	}
}
