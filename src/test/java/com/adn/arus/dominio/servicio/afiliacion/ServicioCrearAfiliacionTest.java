package com.adn.arus.dominio.servicio.afiliacion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.adn.arus.dominio.testdatabuilder.AfiliacionTestDataBuilder;

import co.com.adn.dominio.modelo.Afiliacion;
import co.com.adn.dominio.repositorio.RepositorioAfiliacion;
import co.com.adn.dominio.servicio.afiliacion.ServicioCrearAfiliacion;

class ServicioCrearAfiliacionTest {

	@Test
	void validarCrearAfiliacion() {
		//Arrange
		AfiliacionTestDataBuilder afiliacionTestDataBuilder = new AfiliacionTestDataBuilder();
		Afiliacion afiliacion = afiliacionTestDataBuilder.build();
		
		RepositorioAfiliacion repositorioAfiliacion = Mockito.mock(RepositorioAfiliacion.class);
		ServicioCrearAfiliacion servicioCrearAfiliacion = new ServicioCrearAfiliacion(repositorioAfiliacion);
		// Act
		servicioCrearAfiliacion.ejecutar(afiliacion);
		// Assert
		Assert.assertTrue(true);
	}
}
