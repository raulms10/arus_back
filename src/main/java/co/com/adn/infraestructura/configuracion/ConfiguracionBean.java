package co.com.adn.infraestructura.configuracion;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionBean {
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

}
