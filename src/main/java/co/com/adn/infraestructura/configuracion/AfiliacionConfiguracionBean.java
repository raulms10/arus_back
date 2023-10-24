package co.com.adn.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.adn.dominio.repositorio.RepositorioAfiliacion;
import co.com.adn.dominio.servicio.afiliacion.ServicioCrearAfiliacion;
import co.com.adn.dominio.servicio.afiliacion.ServicioListarAfiliacion;

@Configuration
public class AfiliacionConfiguracionBean {
	
	@Bean
	public ServicioListarAfiliacion servicioListarAfiliacion(RepositorioAfiliacion repositorioAfiliacion) {
		return new ServicioListarAfiliacion(repositorioAfiliacion);
	}
	
	@Bean
	public ServicioCrearAfiliacion servicioCrearAfiliacion(RepositorioAfiliacion repositorioAfiliacion) {
		return new ServicioCrearAfiliacion(repositorioAfiliacion);
	}

}
