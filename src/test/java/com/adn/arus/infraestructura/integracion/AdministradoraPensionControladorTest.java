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

import com.adn.arus.infraestructura.testdatabuilder.ComandoAdministradoraPensionTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.adn.ArusApplication;
import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.dominio.excepcion.ExcepcionValorObligatorio;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArusApplication.class)
@AutoConfigureMockMvc
@Transactional
class AdministradoraPensionControladorTest {

	private static final String URL_ADMINISTRADORA_PENSION = "/administradoras_pension";

	private static final String EL_CODIGO_ES_DATO_OBLIGATORIO = "El código de la Adminsitradora de Pensión es un dato obligatorio.";
	private static final String EL_NOMBRE_ES_DATO_OBLIGATORIO = "El nombre de la Adminsitradora de Pensión es un dato obligatorio.";

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
		ComandoAdministradoraPensionTestDataBuilder comandoAdministradoraPensionTestDataBuilder = new ComandoAdministradoraPensionTestDataBuilder();
		comandoAdministradoraPensionTestDataBuilder = comandoAdministradoraPensionTestDataBuilder.conCodigo("AFP01");
		ComandoAdministradoraPension comandoAdministradoraPension = comandoAdministradoraPensionTestDataBuilder.build();

		// Act - Assert
		this.mockMvc
				.perform(post(URL_ADMINISTRADORA_PENSION).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAdministradoraPension)))
				.andExpect(status().isOk());
	}

	@Test
	void validarCrearConCodigoNulo() throws Exception {
		// Arrange
		ComandoAdministradoraPensionTestDataBuilder comandoAdministradoraPensionTestDataBuilder = new ComandoAdministradoraPensionTestDataBuilder();
		comandoAdministradoraPensionTestDataBuilder = comandoAdministradoraPensionTestDataBuilder.conCodigo(null);
		ComandoAdministradoraPension comandoAdministradoraPension = comandoAdministradoraPensionTestDataBuilder.build();

		// Act - Assert
		this.mockMvc
				.perform(post(URL_ADMINISTRADORA_PENSION).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAdministradoraPension)))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionValorObligatorio.class.getSimpleName()))
				.andExpect(jsonPath("$.mensaje").value(EL_CODIGO_ES_DATO_OBLIGATORIO));
	}

	@Test
	void validarCrearConNombreNulo() throws Exception {
		// Arrange
		ComandoAdministradoraPensionTestDataBuilder comandoAdministradoraPensionTestDataBuilder = new ComandoAdministradoraPensionTestDataBuilder();
		comandoAdministradoraPensionTestDataBuilder = comandoAdministradoraPensionTestDataBuilder.conNombre(null);
		ComandoAdministradoraPension comandoAdministradoraPension = comandoAdministradoraPensionTestDataBuilder.build();

		// Act - Assert
		this.mockMvc
				.perform(post(URL_ADMINISTRADORA_PENSION).contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(comandoAdministradoraPension)))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionValorObligatorio.class.getSimpleName()))
				.andExpect(jsonPath("$.mensaje").value(EL_NOMBRE_ES_DATO_OBLIGATORIO));
	}

}
