package co.com.adn.dominio.servicio.administradorapension;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import co.com.adn.infraestructura.testdatabuilder.ComandoAdministradoraPensionTestDataBuilder;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraPension;

class ServicioListarAdministradoraPensionTest {

	@Test
	void validarListarAdministradoraPension() {
		//Arrange
		List<ComandoAdministradoraPension> listComandoAdministradoraPension = new ArrayList<>();
		ComandoAdministradoraPension comandoAdministradoraPension = new ComandoAdministradoraPensionTestDataBuilder().build();
		listComandoAdministradoraPension.add(comandoAdministradoraPension);
		
		RepositorioAdministradoraPension repositorioAdministradoraPension = Mockito.mock(RepositorioAdministradoraPension.class);
		Mockito.when(repositorioAdministradoraPension.listar()).thenReturn(listComandoAdministradoraPension);
		
		ServicioListarAdministradoraPension servicioListarAdministradoraPension = new ServicioListarAdministradoraPension(repositorioAdministradoraPension);
		// Act
		List<ComandoAdministradoraPension> listAdministradoraPension = servicioListarAdministradoraPension.listar();
		// Assert
		Assert.assertEquals(1, listAdministradoraPension.size());
		Assert.assertEquals(listComandoAdministradoraPension.get(0).getCodigo(), listAdministradoraPension.get(0).getCodigo());
	}
}
