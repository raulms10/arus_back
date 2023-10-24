package co.com.adn.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.adn.dominio.repositorio.RepositorioAfliliado;
import co.com.adn.dominio.servicio.afiliado.ServicioCrearAfiliado;

@Configuration
public class AfiliadoConfiguracionBean {

	@Bean
	public ServicioCrearAfiliado servicioCrearAfiliado(RepositorioAfliliado repositorioAfliliado) {
		return new ServicioCrearAfiliado(repositorioAfliliado);
	}
}
