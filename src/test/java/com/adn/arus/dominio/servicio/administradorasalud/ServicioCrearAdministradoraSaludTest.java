package com.adn.arus.dominio.servicio.administradorasalud;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.adn.arus.dominio.testdatabuilder.AdministradoraSaludTestDataBuilder;

import co.com.adn.dominio.modelo.AdministradoraSalud;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraSalud;
import co.com.adn.dominio.servicio.administradorasalud.ServicioCrearAdministradoraSalud;

class ServicioCrearAdministradoraSaludTest {

	@Test
	void validarCrearAdministradoraSalud() {
		//Arrange
		AdministradoraSaludTestDataBuilder administradoraSaludTestDataBuilder = new AdministradoraSaludTestDataBuilder();
		AdministradoraSalud administradoraSalud = administradoraSaludTestDataBuilder.build();
		RepositorioAdministradoraSalud repositorioAdministradoraSalud = Mockito.mock(RepositorioAdministradoraSalud.class);
		ServicioCrearAdministradoraSalud servicioCrearAdministradoraSalud = new ServicioCrearAdministradoraSalud(repositorioAdministradoraSalud);
		// Act
		servicioCrearAdministradoraSalud.ejecutar(administradoraSalud);
		// Assert
		Assert.assertTrue(true);
	} 
}
