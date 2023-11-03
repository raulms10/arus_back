package co.com.adn.dominio.servicio.administradorasalud;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import co.com.adn.infraestructura.testdatabuilder.ComandoAdministradoraSaludTestDataBuilder;

import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraSalud;

class ServicioListarAdministradoraSaludTest {

	@Test
	void validarListarAdministradoraSalud() {
		//Arrange
		List<ComandoAdministradoraSalud> listComandoAdministradoraSalud = new ArrayList<>();
		ComandoAdministradoraSalud comandoAdministradoraSalud = new ComandoAdministradoraSaludTestDataBuilder().build();
		listComandoAdministradoraSalud.add(comandoAdministradoraSalud);
		
		RepositorioAdministradoraSalud repositorioAdministradoraSalud = Mockito.mock(RepositorioAdministradoraSalud.class);
		Mockito.when(repositorioAdministradoraSalud.listar()).thenReturn(listComandoAdministradoraSalud);
		
		ServicioListarAdministradorasSalud servicioListarAdministradoraSalud = new ServicioListarAdministradorasSalud(repositorioAdministradoraSalud);
		// Act
		List<ComandoAdministradoraSalud> listAdministradoraSalud = servicioListarAdministradoraSalud.listar();
		// Assert
		Assert.assertEquals(1, listAdministradoraSalud.size());
		Assert.assertEquals(listComandoAdministradoraSalud.get(0).getCodigo(), listAdministradoraSalud.get(0).getCodigo());
	}
}
