package co.com.adn.dominio.entidad;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import co.com.adn.dominio.BasePrueba;
import co.com.adn.dominio.testdatabuilder.TipoDocumentoTestDataBuilder;

import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;
import co.com.adn.dominio.modelo.TipoDocumento;

public class TipoDocumentoTest {
	
	private static final String EL_CODIGO_ES_DATO_OBLIGATORIO = "El código del tipo de documento es un dato obligatorio.";
	private static final String EL_NOMBRE_ES_DATO_OBLIGATORIO = "El nombre del tipo de documento es un dato obligatorio.";

	@Test
	void validarCrearTipoDocumento() {
		//Arrange
		TipoDocumentoTestDataBuilder tipoDocumentoTestDataBuilder = new TipoDocumentoTestDataBuilder();
		//Act
		TipoDocumento tipoDocumento = tipoDocumentoTestDataBuilder.build();
		//Assert
		Assert.assertNotNull(tipoDocumento);
		Assert.assertNotNull(tipoDocumento.getCodigo());
		Assert.assertNotNull(tipoDocumento.getNombre());
	}
	
	@Test
	void validarCodigoTipoDocumentoObligatorio() {
		//Arrange
		TipoDocumentoTestDataBuilder tipoDocumentoTestDataBuilder = new TipoDocumentoTestDataBuilder();
		tipoDocumentoTestDataBuilder.conCodigo(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> tipoDocumentoTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_CODIGO_ES_DATO_OBLIGATORIO);
	}
	
	@Test
	void validarNombreTipoDocumentoObligatorio() {
		//Arrange
		TipoDocumentoTestDataBuilder tipoDocumentoTestDataBuilder = new TipoDocumentoTestDataBuilder();
		tipoDocumentoTestDataBuilder.conNombre(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> tipoDocumentoTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_NOMBRE_ES_DATO_OBLIGATORIO);
	}
}
