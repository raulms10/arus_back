package co.com.adn.infraestructura.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.aplicacion.manejador.administradorapension.ManejadorCrearAdministradoraPension;
import co.com.adn.aplicacion.manejador.administradorapension.ManejadorListarAdministradoraPension;

@RestController
@RequestMapping(value = "/administradoras_pension")
public class AdministradoraPensionControlador {

	private final ManejadorCrearAdministradoraPension manejadorCrearAdministradoraPension;
	private final ManejadorListarAdministradoraPension manejadorListarAdministradoraPension;
	
	public AdministradoraPensionControlador(ManejadorCrearAdministradoraPension manejadorCrearAdministradoraPension,
			ManejadorListarAdministradoraPension manejadorListarAdministradoraPension) {
		super();
		this.manejadorCrearAdministradoraPension = manejadorCrearAdministradoraPension;
		this.manejadorListarAdministradoraPension = manejadorListarAdministradoraPension;
	}
	
	@PostMapping
	public void crear(@RequestBody ComandoAdministradoraPension comandoAdministradoraPension) {
		this.manejadorCrearAdministradoraPension.ejecutar(comandoAdministradoraPension);
	}
	
	@PostMapping(path = "/todos")
	public void crearTodos(@RequestBody List<ComandoAdministradoraPension> listComandoAdministradoraPension) {
		for (ComandoAdministradoraPension comandoAdministradoraPension : listComandoAdministradoraPension) {
			this.manejadorCrearAdministradoraPension.ejecutar(comandoAdministradoraPension);
		}
	}
	
	@GetMapping
	public List<ComandoAdministradoraPension> listar() {
		return this.manejadorListarAdministradoraPension.listar();
	}
	
}
