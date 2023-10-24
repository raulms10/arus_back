package co.com.adn.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.adn.dominio.repositorio.RepositorioAdministradoraSalud;
import co.com.adn.dominio.servicio.administradorasalud.ServicioCrearAdministradoraSalud;
import co.com.adn.dominio.servicio.administradorasalud.ServicioListarAdministradorasSalud;

@Configuration
public class AdministradoraSaludConfiguracionBean {

	@Bean
	public ServicioListarAdministradorasSalud servicioListarAdministradorasSalud(RepositorioAdministradoraSalud repositorioAdministradoraSalud) {
		return new ServicioListarAdministradorasSalud(repositorioAdministradoraSalud);
	}
	
	@Bean
	public ServicioCrearAdministradoraSalud servicioCrearAdministradoraSalud(RepositorioAdministradoraSalud repositorioAdministradoraSalud) {
		return new ServicioCrearAdministradoraSalud(repositorioAdministradoraSalud);
	}
}
