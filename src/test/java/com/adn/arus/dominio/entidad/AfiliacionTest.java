package com.adn.arus.dominio.entidad;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.adn.arus.dominio.BasePrueba;
import com.adn.arus.dominio.testdatabuilder.AfiliacionTestDataBuilder;

import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;
import co.com.adn.dominio.modelo.Afiliacion;

class AfiliacionTest {
	
	private static final String EL_AFILIADO_ES_DATO_OBLIGATORIO = "El Afiliado es un dato obligatorio.";
	private static final String LA_ADMINISTRADORA_SALUD_ES_DATO_OBLIGATORIO = "La Administradora de Salud es un dato obligatorio.";
	private static final String LA_FECHA_AFILIACION_SALUD_ES_DATO_OBLIGATORIO = "La fecha de afiliación a salud es un dato obligatorio.";
	private static final String LA_ADMINISTRADORA_PENSION_ES_DATO_OBLIGATORIO = "La Administradora de Pensión es un dato obligatorio.";
	private static final String LA_FECHA_AFILIACION_PENSION_ES_DATO_OBLIGATORIO = "La fecha de afiliación a pensión es un dato obligatorio.";

	@Test
	void validarCrearAfiliacion() {
		//Arrange
		AfiliacionTestDataBuilder afiliacionTestDataBuilder = new AfiliacionTestDataBuilder();
		//Act
		Afiliacion afiliacion = afiliacionTestDataBuilder.build();
		//Assert
		Assert.assertNotNull(afiliacion);
		Assert.assertNotNull(afiliacion.getCodigo());
		Assert.assertNotNull(afiliacion.getAfiliado());
		Assert.assertNotNull(afiliacion.getAdministradoraSalud());
		Assert.assertNotNull(afiliacion.getFechaAfiliacionSalud());
		Assert.assertNotNull(afiliacion.getAdministradoraPension());
		Assert.assertNotNull(afiliacion.getFechaAfiliacionPension());
	}
	
	@Test
	void validarAfiliadoObligatorio() {
		//Arrange
		AfiliacionTestDataBuilder afiliacionTestDataBuilder = new AfiliacionTestDataBuilder();
		afiliacionTestDataBuilder.conAfiliado(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> afiliacionTestDataBuilder.build(), ExcepcionValorObligatorio.class, EL_AFILIADO_ES_DATO_OBLIGATORIO);		
	}
	
	@Test
	void validarAdministradoraSaludObligatoria() {
		//Arrange
		AfiliacionTestDataBuilder afiliacionTestDataBuilder = new AfiliacionTestDataBuilder();
		afiliacionTestDataBuilder.conAdministradoraSalud(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> afiliacionTestDataBuilder.build(), ExcepcionValorObligatorio.class, LA_ADMINISTRADORA_SALUD_ES_DATO_OBLIGATORIO);		
	}
	
	@Test
	void validarFechaAfiliacionSaludObligatoria() {
		//Arrange
		AfiliacionTestDataBuilder afiliacionTestDataBuilder = new AfiliacionTestDataBuilder();
		afiliacionTestDataBuilder.conFechaAfiliacionSalud(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> afiliacionTestDataBuilder.build(), ExcepcionValorObligatorio.class, LA_FECHA_AFILIACION_SALUD_ES_DATO_OBLIGATORIO);		
	}
	
	@Test
	void validarAdministradoraPensionObligatoria() {
		//Arrange
		AfiliacionTestDataBuilder afiliacionTestDataBuilder = new AfiliacionTestDataBuilder();
		afiliacionTestDataBuilder.conAdministradoraPension(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> afiliacionTestDataBuilder.build(), ExcepcionValorObligatorio.class, LA_ADMINISTRADORA_PENSION_ES_DATO_OBLIGATORIO);		
	}
	
	@Test
	void validarFechaAfiliacionPensionObligatoria() {
		//Arrange
		AfiliacionTestDataBuilder afiliacionTestDataBuilder = new AfiliacionTestDataBuilder();
		afiliacionTestDataBuilder.conFechaAfiliacionPension(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> afiliacionTestDataBuilder.build(), ExcepcionValorObligatorio.class, LA_FECHA_AFILIACION_PENSION_ES_DATO_OBLIGATORIO);		
	}
}
