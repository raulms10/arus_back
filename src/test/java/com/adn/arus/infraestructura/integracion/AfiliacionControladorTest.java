package com.adn.arus.infraestructura.integracion;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.adn.arus.infraestructura.testdatabuilder.ComandoAfiliacionTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.adn.ArusApplication;
import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArusApplication.class)
@AutoConfigureMockMvc
@Transactional
class AfiliacionControladorTest {

	private static final String URL_AFILIACION = "/afiliacion";
	
	private static final String EL_AFILIADO_ES_DATO_OBLIGATORIO = "El Afiliado es un dato obligatorio.";
	private static final String LA_ADMINISTRADORA_SALUD_ES_DATO_OBLIGATORIO = "La Administradora de Salud es un dato obligatorio.";
	private static final String LA_FECHA_AFILIACION_SALUD_ES_DATO_OBLIGATORIO = "La fecha de afiliación a salud es un dato obligatorio.";
	private static final String LA_ADMINISTRADORA_PENSION_ES_DATO_OBLIGATORIO = "La Administradora de Pensión es un dato obligatorio.";
	private static final String LA_FECHA_AFILIACION_PENSION_ES_DATO_OBLIGATORIO = "La fecha de afiliación a pensión es un dato obligatorio.";

	@Autowired
	private WebApplicationContext context;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private MockMvc mockMvc;

	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	void validarCrear() throws Exception {
		// Arrange
		ComandoAfiliacionTestDataBuilder comandoAfiliacionTestDataBuilder = new ComandoAfiliacionTestDataBuilder();
		comandoAfiliacionTestDataBuilder = comandoAfiliacionTestDataBuilder.conCodigo("AF_001");
		ComandoAfiliacion comandoAfiliacion = comandoAfiliacionTestDataBuilder.build();
		
		// Act - Assert
		this.mockMvc.perform(post(URL_AFILIACION).contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comandoAfiliacion))).andExpect(status().isOk());
	}

	@Test
	void validarCrearConAfiliadoNulo() throws Exception {
		// Arrange
		ComandoAfiliacionTestDataBuilder comandoAfiliacionTestDataBuilder = new ComandoAfiliacionTestDataBuilder();
		comandoAfiliacionTestDataBuilder = comandoAfiliacionTestDataBuilder.conAfiliado(null);
		ComandoAfiliacion comandoAfiliacion = comandoAfiliacionTestDataBuilder.build();
		
		// Act - Assert
		this.mockMvc
				.perform(post(URL_AFILIACION).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAfiliacion)))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionValorObligatorio.class.getSimpleName()))
				.andExpect(jsonPath("$.mensaje").value(EL_AFILIADO_ES_DATO_OBLIGATORIO));
	}
	
	@Test
	void validarCrearConAdministradoraSaludNula() throws Exception {
		// Arrange
		ComandoAfiliacionTestDataBuilder comandoAfiliacionTestDataBuilder = new ComandoAfiliacionTestDataBuilder();
		comandoAfiliacionTestDataBuilder = comandoAfiliacionTestDataBuilder.conAdministradoraSalud(null);
		ComandoAfiliacion comandoAfiliacion = comandoAfiliacionTestDataBuilder.build();
		
		// Act - Assert
		this.mockMvc
				.perform(post(URL_AFILIACION).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAfiliacion)))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionValorObligatorio.class.getSimpleName()))
				.andExpect(jsonPath("$.mensaje").value(LA_ADMINISTRADORA_SALUD_ES_DATO_OBLIGATORIO));
	}
	
	@Test
	void validarCrearConFechaAfiliacionSaludNula() throws Exception {
		// Arrange
		ComandoAfiliacionTestDataBuilder comandoAfiliacionTestDataBuilder = new ComandoAfiliacionTestDataBuilder();
		comandoAfiliacionTestDataBuilder = comandoAfiliacionTestDataBuilder.conFechaAfiliacionSalud(null);
		ComandoAfiliacion comandoAfiliacion = comandoAfiliacionTestDataBuilder.build();
		
		// Act - Assert
		this.mockMvc
				.perform(post(URL_AFILIACION).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAfiliacion)))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionValorObligatorio.class.getSimpleName()))
				.andExpect(jsonPath("$.mensaje").value(LA_FECHA_AFILIACION_SALUD_ES_DATO_OBLIGATORIO));
	}
	
	@Test
	void validarCrearConAdministradoraPensionNula() throws Exception {
		// Arrange
		ComandoAfiliacionTestDataBuilder comandoAfiliacionTestDataBuilder = new ComandoAfiliacionTestDataBuilder();
		comandoAfiliacionTestDataBuilder = comandoAfiliacionTestDataBuilder.conAdministradoraPension(null);
		ComandoAfiliacion comandoAfiliacion = comandoAfiliacionTestDataBuilder.build();
		
		// Act - Assert
		this.mockMvc
				.perform(post(URL_AFILIACION).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAfiliacion)))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionValorObligatorio.class.getSimpleName()))
				.andExpect(jsonPath("$.mensaje").value(LA_ADMINISTRADORA_PENSION_ES_DATO_OBLIGATORIO));
	}
	
	@Test
	void validarCrearConFechaAfiliacionPensionNula() throws Exception {
		// Arrange
		ComandoAfiliacionTestDataBuilder comandoAfiliacionTestDataBuilder = new ComandoAfiliacionTestDataBuilder();
		comandoAfiliacionTestDataBuilder = comandoAfiliacionTestDataBuilder.conFechaAfiliacionPension(null);
		ComandoAfiliacion comandoAfiliacion = comandoAfiliacionTestDataBuilder.build();
		
		// Act - Assert
		this.mockMvc
				.perform(post(URL_AFILIACION).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAfiliacion)))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionValorObligatorio.class.getSimpleName()))
				.andExpect(jsonPath("$.mensaje").value(LA_FECHA_AFILIACION_PENSION_ES_DATO_OBLIGATORIO));
	}
}
