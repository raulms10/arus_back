package co.com.adn.infraestructura.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.aplicacion.manejador.afiliacion.ManejadorCrearAfiliacion;
import co.com.adn.aplicacion.manejador.afiliacion.ManejadorListarAfiliacion;
import co.com.adn.aplicacion.manejador.afiliado.ManejadorCrearAfiliado;

@RestController
@RequestMapping(value = "/afiliacion")
public class AfiliacionControlador {
	
	private final ManejadorCrearAfiliacion manejadorCrearAfiliacion;
	private final ManejadorCrearAfiliado manejadorCrearAfiliado;
	private final ManejadorListarAfiliacion manejadorListarAfiliacion;
	
	public AfiliacionControlador(ManejadorCrearAfiliacion manejadorCrearAfiliacion,
			ManejadorCrearAfiliado manejadorCrearAfiliado, ManejadorListarAfiliacion manejadorListarAfiliacion) {
		this.manejadorCrearAfiliacion = manejadorCrearAfiliacion;
		this.manejadorCrearAfiliado = manejadorCrearAfiliado;
		this.manejadorListarAfiliacion = manejadorListarAfiliacion;
	}

	@PostMapping
	public void crear(@RequestBody ComandoAfiliacion comandoAfiliacion) {
		this.manejadorCrearAfiliado.ejecutar(comandoAfiliacion.getAfiliado());
		this.manejadorCrearAfiliacion.ejecutar(comandoAfiliacion);
	}
	
	@GetMapping
	public List<ComandoAfiliacion> listar() {
		return this.manejadorListarAfiliacion.listar();
	}
}
