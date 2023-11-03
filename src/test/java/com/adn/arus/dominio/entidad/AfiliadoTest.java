package com.adn.arus.dominio.entidad;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.adn.arus.dominio.BasePrueba;
import com.adn.arus.dominio.testdatabuilder.AfiliadoTestDataBuilder;

import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;
import co.com.adn.dominio.modelo.Afiliado;

class AfiliadoTest {
	
	private static final String EL_TIPO_DOCUMENTO_ES_DATO_OBLIGATORIO = "El tipo de documento del Afiliado es un dato obligatorio.";
	private static final String EL_NUMERO_DOCUMENTO_ES_DATO_OBLIGATORIO = "El número de documento del Afiliado es un dato obligatorio.";
	private static final String EL_PRIMER_NOMBRE_ES_DATO_OBLIGATORIO = "El primer nombre del Afiliado es un dato obligatorio.";
	private static final String EL_PRIMER_APELLIDO_ES_DATO_OBLIGATORIO = "El primer apellido del Afiliado es un dato obligatorio.";
	
	@Test
	void validarCrearAfiliado() {
		//Arrange
		AfiliadoTestDataBuilder afiliadoTestDataBuilder = new AfiliadoTestDataBuilder();
		//Act
		Afiliado afiliado = afiliadoTestDataBuilder.build();
		//Assert
		Assert.assertNotNull(afiliado);
		Assert.assertNotNull(afiliado.getTipoDocumento());
		Assert.assertNotNull(afiliado.getNumeroDocumento());
		Assert.assertNotNull(afiliado.getPrimerNombre());
		Assert.assertNotNull(afiliado.getPrimerApellido());
	}
	
	@Test
	void validarTipoDocumentoObligatorio() {
		//Arrange
		AfiliadoTestDataBuilder afiliadoTestDataBuilder = new AfiliadoTestDataBuilder();
		afiliadoTestDataBuilder.conTipoDocumento(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> afiliadoTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_TIPO_DOCUMENTO_ES_DATO_OBLIGATORIO);		
	}
	
	@Test
	void validarNumeroDocumentoObligatorio() {
		//Arrange
		AfiliadoTestDataBuilder afiliadoTestDataBuilder = new AfiliadoTestDataBuilder();
		afiliadoTestDataBuilder.conNumeroDocumento(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> afiliadoTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_NUMERO_DOCUMENTO_ES_DATO_OBLIGATORIO);		
	}
	
	@Test
	void validarPrimerNombreObligatorio() {
		//Arrange
		AfiliadoTestDataBuilder afiliadoTestDataBuilder = new AfiliadoTestDataBuilder();
		afiliadoTestDataBuilder.conPrimerNombre(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> afiliadoTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_PRIMER_NOMBRE_ES_DATO_OBLIGATORIO);		
	}
	
	@Test
	void validarPrimerApellidoObligatorio() {
		//Arrange
		AfiliadoTestDataBuilder afiliadoTestDataBuilder = new AfiliadoTestDataBuilder();
		afiliadoTestDataBuilder.conPrimerApellido(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> afiliadoTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_PRIMER_APELLIDO_ES_DATO_OBLIGATORIO);		
	}
	
	@Test
	void validarSegundoNombreNoObligatorio() {
		//Arrange
		AfiliadoTestDataBuilder afiliadoTestDataBuilder = new AfiliadoTestDataBuilder();
		afiliadoTestDataBuilder.conSegundoNombre(null);
		//Act 
		Afiliado afiliado = afiliadoTestDataBuilder.build();
		//Assert
		Assert.assertNotNull(afiliado);
		Assert.assertNotNull(afiliado.getTipoDocumento());
		Assert.assertNotNull(afiliado.getNumeroDocumento());
		Assert.assertNotNull(afiliado.getPrimerNombre());
		Assert.assertNull(afiliado.getSegundoNombre());
		Assert.assertNotNull(afiliado.getPrimerApellido());		
	}
	
	@Test
	void validarSegundoApellidoNoObligatorio() {
		//Arrange
		AfiliadoTestDataBuilder afiliadoTestDataBuilder = new AfiliadoTestDataBuilder();
		afiliadoTestDataBuilder.conSegundoApellido(null);
		//Act 
		Afiliado afiliado = afiliadoTestDataBuilder.build();
		//Assert
		Assert.assertNotNull(afiliado);
		Assert.assertNotNull(afiliado.getTipoDocumento());
		Assert.assertNotNull(afiliado.getNumeroDocumento());
		Assert.assertNotNull(afiliado.getPrimerNombre());
		Assert.assertNotNull(afiliado.getPrimerApellido());
		Assert.assertNull(afiliado.getSegundoApellido());
	}
}
