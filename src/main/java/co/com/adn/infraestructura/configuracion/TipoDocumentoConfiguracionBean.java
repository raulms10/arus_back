package co.com.adn.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.adn.dominio.repositorio.RepositorioTipoDocumento;
import co.com.adn.dominio.servicio.tipodocumento.ServicioCrearTipoDocumento;
import co.com.adn.dominio.servicio.tipodocumento.ServicioListarTipoDocumento;

@Configuration
public class TipoDocumentoConfiguracionBean {
	
	@Bean
	public ServicioListarTipoDocumento servicioListarTipoDocumento(RepositorioTipoDocumento repositorioTipoDocumento) {
		return new ServicioListarTipoDocumento(repositorioTipoDocumento);
	}
	
	@Bean
	public ServicioCrearTipoDocumento servicioCrearTipoDocumento(RepositorioTipoDocumento repositorioTipoDocumento) {
		return new ServicioCrearTipoDocumento(repositorioTipoDocumento);
	}

}
