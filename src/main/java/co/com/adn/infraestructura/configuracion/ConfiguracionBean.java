package co.com.adn.infraestructura.configuracion;

import java.text.DateFormat;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.adn.infraestructura.compartido.FormateadorFecha;

@Configuration
public class ConfiguracionBean {
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	@Bean
    public ObjectMapper objectMapper() {
	    DateFormat dateFormat = FormateadorFecha.getDateFormat();
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setDateFormat(dateFormat);
	    return mapper;
	}

}
