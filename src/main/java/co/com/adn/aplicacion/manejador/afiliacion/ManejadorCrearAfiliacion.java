package co.com.adn.aplicacion.manejador.afiliacion;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.aplicacion.fabrica.FabricaAfiliacion;
import co.com.adn.dominio.modelo.Afiliacion;
import co.com.adn.dominio.servicio.afiliacion.ServicioCrearAfiliacion;

@Component
public class ManejadorCrearAfiliacion {

	private final ServicioCrearAfiliacion servicioCrearAfiliacion;
	private final FabricaAfiliacion fabricaAfiliacion;
	
	public ManejadorCrearAfiliacion(ServicioCrearAfiliacion servicioCrearAfiliacion,
			FabricaAfiliacion fabricaAfiliacion) {
		this.servicioCrearAfiliacion = servicioCrearAfiliacion;
		this.fabricaAfiliacion = fabricaAfiliacion;
	}
	
	public void ejecutar(ComandoAfiliacion comandoAfiliacion) {
		Afiliacion afiliacion = this.fabricaAfiliacion.crearAfiliacion(comandoAfiliacion);
		this.servicioCrearAfiliacion.ejecutar(afiliacion);
	}
}
