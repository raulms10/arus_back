package co.com.adn.dominio.servicio.tipodocumento;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import co.com.adn.dominio.testdatabuilder.TipoDocumentoTestDataBuilder;

import co.com.adn.dominio.modelo.TipoDocumento;
import co.com.adn.dominio.repositorio.RepositorioTipoDocumento;

class ServicioCrearTipoDocumentoTest {

	@Test
	void validarCrearTipoDocumento() {
		//Arrange
		TipoDocumentoTestDataBuilder tipoDocumentoTestDataBuilder = new TipoDocumentoTestDataBuilder();
		TipoDocumento tipoDocumento = tipoDocumentoTestDataBuilder.build();
		
		RepositorioTipoDocumento repositorioTipoDocumento = Mockito.mock(RepositorioTipoDocumento.class);
		ServicioCrearTipoDocumento servicioCrearTipoDocumento = new ServicioCrearTipoDocumento(repositorioTipoDocumento);
		// Act
		servicioCrearTipoDocumento.ejecutar(tipoDocumento);
		// Assert
		Assert.assertTrue(true);
	}
}
