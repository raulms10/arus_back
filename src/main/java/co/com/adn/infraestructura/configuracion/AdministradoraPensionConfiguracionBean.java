package co.com.adn.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.adn.dominio.repositorio.RepositorioAdministradoraPension;
import co.com.adn.dominio.servicio.administradorapension.ServicioCrearAdministradoraPension;
import co.com.adn.dominio.servicio.administradorapension.ServicioListarAdministradoraPension;

@Configuration
public class AdministradoraPensionConfiguracionBean {

	@Bean
	public ServicioListarAdministradoraPension servicioListarAdministradoraPension(RepositorioAdministradoraPension repositorioAdministradoraPension) {
		return new ServicioListarAdministradoraPension(repositorioAdministradoraPension);
	}
	
	@Bean
	public ServicioCrearAdministradoraPension servicioCrearAdministradoraPension(RepositorioAdministradoraPension repositorioAdministradoraPension) {
		return new ServicioCrearAdministradoraPension(repositorioAdministradoraPension);
	}
}
