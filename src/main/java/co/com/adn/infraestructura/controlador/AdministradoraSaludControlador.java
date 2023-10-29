package co.com.adn.infraestructura.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.aplicacion.manejador.administradorasalud.ManejadorCrearAdministradoraSalud;
import co.com.adn.aplicacion.manejador.administradorasalud.ManejadorListarAdministradoraSalud;

@RestController
@RequestMapping(value = "/administradoras_salud")
public class AdministradoraSaludControlador {
	
	private final ManejadorCrearAdministradoraSalud manejadorCrearAdministradoraSalud;
	private final ManejadorListarAdministradoraSalud manejadorListarAdministradoraSalud;
	
	public AdministradoraSaludControlador(ManejadorCrearAdministradoraSalud manejadorCrearAdministradoraSalud,
			ManejadorListarAdministradoraSalud manejadorListarAdministradoraSalud) {
		super();
		this.manejadorCrearAdministradoraSalud = manejadorCrearAdministradoraSalud;
		this.manejadorListarAdministradoraSalud = manejadorListarAdministradoraSalud;
	}
	
	@PostMapping
	public void crear(@RequestBody ComandoAdministradoraSalud comandoAdministradoraSalud) {
		this.manejadorCrearAdministradoraSalud.ejecutar(comandoAdministradoraSalud);
	}
	
	@GetMapping
	public List<ComandoAdministradoraSalud> listar() {
		return this.manejadorListarAdministradoraSalud.listar();
	}

}	
