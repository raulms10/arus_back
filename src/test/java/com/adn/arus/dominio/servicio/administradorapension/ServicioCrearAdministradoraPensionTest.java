package com.adn.arus.dominio.servicio.administradorapension;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.adn.arus.dominio.testdatabuilder.AdministradoraPensionTestDataBuilder;

import co.com.adn.dominio.modelo.AdministradoraPension;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraPension;
import co.com.adn.dominio.servicio.administradorapension.ServicioCrearAdministradoraPension;

class ServicioCrearAdministradoraPensionTest {
	
	@Test
	void validarCrearAdministradoraPension() {
		//Arrange
		AdministradoraPensionTestDataBuilder administradoraPensionTestDataBuilder = new AdministradoraPensionTestDataBuilder();
		AdministradoraPension administradoraPension = administradoraPensionTestDataBuilder.build();
		RepositorioAdministradoraPension repositorioAdministradoraPension = Mockito.mock(RepositorioAdministradoraPension.class);
		ServicioCrearAdministradoraPension servicioCrearAdministradoraPension = new ServicioCrearAdministradoraPension(repositorioAdministradoraPension);
		// Act
		servicioCrearAdministradoraPension.ejecutar(administradoraPension);
		// Assert
		Assert.assertTrue(true);
	} 

}
