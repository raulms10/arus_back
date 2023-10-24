package co.com.adn.aplicacion.manejador.afiliado;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAfiliado;
import co.com.adn.aplicacion.fabrica.FabricaAfiliado;
import co.com.adn.dominio.modelo.Afiliado;
import co.com.adn.dominio.servicio.afiliado.ServicioCrearAfiliado;

@Component
public class ManejadorCrearAfiliado {

	private final ServicioCrearAfiliado servicioCrearAfiliado;
	private final FabricaAfiliado fabricaAfiliado;
	
	public ManejadorCrearAfiliado(ServicioCrearAfiliado servicioCrearAfiliado, FabricaAfiliado fabricaAfiliado) {
		this.servicioCrearAfiliado = servicioCrearAfiliado;
		this.fabricaAfiliado = fabricaAfiliado;
	}

	public void ejecutar(ComandoAfiliado comandoAfiliado) {
		Afiliado afiliado = this.fabricaAfiliado.crearAfiliado(comandoAfiliado);
		this.servicioCrearAfiliado.ejecutar(afiliado);
	}
}
