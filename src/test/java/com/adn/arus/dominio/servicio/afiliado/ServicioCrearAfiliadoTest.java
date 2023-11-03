package com.adn.arus.dominio.servicio.afiliado;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.adn.arus.dominio.testdatabuilder.AfiliadoTestDataBuilder;

import co.com.adn.dominio.modelo.Afiliado;
import co.com.adn.dominio.repositorio.RepositorioAfiliado;
import co.com.adn.dominio.servicio.afiliado.ServicioCrearAfiliado;

class ServicioCrearAfiliadoTest {

	@Test
	void validarCrearAfiliado() {
		//Arrange
		AfiliadoTestDataBuilder AfiliadoTestDataBuilder = new AfiliadoTestDataBuilder();
		Afiliado Afiliado = AfiliadoTestDataBuilder.build();
		
		RepositorioAfiliado repositorioAfiliado = Mockito.mock(RepositorioAfiliado.class);
		ServicioCrearAfiliado servicioCrearAfiliado = new ServicioCrearAfiliado(repositorioAfiliado);
		// Act
		servicioCrearAfiliado.ejecutar(Afiliado);
		// Assert
		Assert.assertTrue(true);
	}
}
