package co.com.adn.aplicacion.manejador.afiliacion;

import java.util.List;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.dominio.servicio.afiliacion.ServicioListarAfiliacion;

@Component
public class ManejadorListarAfiliacion {

	private final ServicioListarAfiliacion servicioListarAfiliacion;

	public ManejadorListarAfiliacion(ServicioListarAfiliacion servicioListarAfiliacion) {
		this.servicioListarAfiliacion = servicioListarAfiliacion;
	}
	
	public List<ComandoAfiliacion> listar() {
		return this.servicioListarAfiliacion.listar();
	}
}
