package com.adn.arus.dominio.servicio.tipodocumento;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.adn.arus.infraestructura.testdatabuilder.ComandoTipoDocumentoTestDataBuilder;

import co.com.adn.aplicacion.comando.ComandoTipoDocumento;
import co.com.adn.dominio.repositorio.RepositorioTipoDocumento;
import co.com.adn.dominio.servicio.tipodocumento.ServicioListarTipoDocumento;

class ServicioListarTipoDocumentoTest {

	@Test
	void validarListarTipoDocumento() {
		//Arrange
		List<ComandoTipoDocumento> listComandoTipoDocumentos = new ArrayList<>();
		ComandoTipoDocumento comandoTipoDocumento = new ComandoTipoDocumentoTestDataBuilder().build();
		listComandoTipoDocumentos.add(comandoTipoDocumento);

		RepositorioTipoDocumento repositorioTipoDocumento = Mockito.mock(RepositorioTipoDocumento.class);
		Mockito.when(repositorioTipoDocumento.listar()).thenReturn(listComandoTipoDocumentos);

		ServicioListarTipoDocumento servicioListarTipoDocumento = new ServicioListarTipoDocumento(repositorioTipoDocumento);

		// Act
		List<ComandoTipoDocumento> listTipoDocumento = servicioListarTipoDocumento.listar();
		// Assert
		Assert.assertEquals(1, listTipoDocumento.size());
		Assert.assertEquals(listComandoTipoDocumentos.get(0).getCodigo(), listTipoDocumento.get(0).getCodigo());
	}
}
