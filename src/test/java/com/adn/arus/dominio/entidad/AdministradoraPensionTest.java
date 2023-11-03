package com.adn.arus.dominio.entidad;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.adn.arus.dominio.BasePrueba;
import com.adn.arus.dominio.testdatabuilder.AdministradoraPensionTestDataBuilder;

import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;
import co.com.adn.dominio.modelo.AdministradoraPension;

class AdministradoraPensionTest {
	
	private static final String EL_CODIGO_ES_DATO_OBLIGATORIO = "El código de la Adminsitradora de Pensión es un dato obligatorio.";
	private static final String EL_NOMBRE_ES_DATO_OBLIGATORIO = "El nombre de la Adminsitradora de Pensión es un dato obligatorio.";
	
	@Test
	void validarCrearAdministradoraPension() {
		//Arrange
		AdministradoraPensionTestDataBuilder administradoraPensionTestDataBuilder = new AdministradoraPensionTestDataBuilder();
		//Act
		AdministradoraPension administradoraPension = administradoraPensionTestDataBuilder.build();
		//Assert
		Assert.assertNotNull(administradoraPension);
		Assert.assertNotNull(administradoraPension.getCodigo());
		Assert.assertNotNull(administradoraPension.getNombre());
	}
	
	@Test
	void validarCodigoObligatorio() {
		//Arrange
		AdministradoraPensionTestDataBuilder administradoraPensionTestDataBuilder = new AdministradoraPensionTestDataBuilder();
		administradoraPensionTestDataBuilder.conCodigo(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> administradoraPensionTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_CODIGO_ES_DATO_OBLIGATORIO);
	}
	
	@Test
	void validarNombreObligatorio() {
		//Arrange
		AdministradoraPensionTestDataBuilder administradoraPensionTestDataBuilder = new AdministradoraPensionTestDataBuilder();
		administradoraPensionTestDataBuilder.conNombre(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> administradoraPensionTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_NOMBRE_ES_DATO_OBLIGATORIO);
	}

}
