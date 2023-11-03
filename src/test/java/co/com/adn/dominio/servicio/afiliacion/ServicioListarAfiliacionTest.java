package co.com.adn.dominio.servicio.afiliacion;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import co.com.adn.infraestructura.testdatabuilder.ComandoAfiliacionTestDataBuilder;

import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.dominio.repositorio.RepositorioAfiliacion;

class ServicioListarAfiliacionTest {

	@Test
	void validarListarAfiliacion() {
		//Arrange
		List<ComandoAfiliacion> listComandoAfiliacions = new ArrayList<>();
		ComandoAfiliacion comandoAfiliacion = new ComandoAfiliacionTestDataBuilder().build();
		listComandoAfiliacions.add(comandoAfiliacion);

		RepositorioAfiliacion repositorioAfiliacion = Mockito.mock(RepositorioAfiliacion.class);
		Mockito.when(repositorioAfiliacion.listar()).thenReturn(listComandoAfiliacions);

		ServicioListarAfiliacion servicioListarAfiliacion = new ServicioListarAfiliacion(repositorioAfiliacion);

		// Act
		List<ComandoAfiliacion> listAfiliacion = servicioListarAfiliacion.listar();
		// Assert
		Assert.assertEquals(1, listAfiliacion.size());
		Assert.assertEquals(listComandoAfiliacions.get(0).getCodigo(), listAfiliacion.get(0).getCodigo());
	}
}
