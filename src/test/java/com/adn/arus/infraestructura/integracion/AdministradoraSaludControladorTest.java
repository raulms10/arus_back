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

import com.adn.arus.infraestructura.testdatabuilder.ComandoAdministradoraSaludTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.adn.ArusApplication;
import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArusApplication.class)
@AutoConfigureMockMvc
@Transactional
class AdministradoraSaludControladorTest {

	private static final String URL_ADMINISTRADORA_SALUD = "/administradoras_salud";

	private static final String EL_CODIGO_ES_DATO_OBLIGATORIO = "El código de la Administradora de Salud es un dato obligatorio.";
	private static final String EL_NOMBRE_ES_DATO_OBLIGATORIO = "El nombre de la Administradora de Salud es un dato obligatorio.";

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
		ComandoAdministradoraSaludTestDataBuilder comandoAdministradoraSaludTestDataBuilder = new ComandoAdministradoraSaludTestDataBuilder();
		comandoAdministradoraSaludTestDataBuilder = comandoAdministradoraSaludTestDataBuilder.conCodigo("EPS01");
		ComandoAdministradoraSalud comandoAdministradoraSalud = comandoAdministradoraSaludTestDataBuilder.build();

		// Act - Assert
		this.mockMvc
				.perform(post(URL_ADMINISTRADORA_SALUD).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAdministradoraSalud)))
				.andExpect(status().isOk());
	}

	@Test
	void validarCrearConCodigoNulo() throws Exception {
		// Arrange
		ComandoAdministradoraSaludTestDataBuilder comandoAdministradoraSaludTestDataBuilder = new ComandoAdministradoraSaludTestDataBuilder();
		comandoAdministradoraSaludTestDataBuilder = comandoAdministradoraSaludTestDataBuilder.conCodigo(null);
		ComandoAdministradoraSalud comandoAdministradoraSalud = comandoAdministradoraSaludTestDataBuilder.build();

		// Act - Assert
		this.mockMvc
				.perform(post(URL_ADMINISTRADORA_SALUD).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAdministradoraSalud)))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionValorObligatorio.class.getSimpleName()))
				.andExpect(jsonPath("$.mensaje").value(EL_CODIGO_ES_DATO_OBLIGATORIO));
	}

	@Test
	void validarCrearConNombreNulo() throws Exception {
		// Arrange
		ComandoAdministradoraSaludTestDataBuilder comandoAdministradoraSaludTestDataBuilder = new ComandoAdministradoraSaludTestDataBuilder();
		comandoAdministradoraSaludTestDataBuilder = comandoAdministradoraSaludTestDataBuilder.conNombre(null);
		ComandoAdministradoraSalud comandoAdministradoraSalud = comandoAdministradoraSaludTestDataBuilder.build();

		// Act - Assert
		this.mockMvc
				.perform(post(URL_ADMINISTRADORA_SALUD).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAdministradoraSalud)))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionValorObligatorio.class.getSimpleName()))
				.andExpect(jsonPath("$.mensaje").value(EL_NOMBRE_ES_DATO_OBLIGATORIO));
	}
}
