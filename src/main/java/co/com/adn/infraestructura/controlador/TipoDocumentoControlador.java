package co.com.adn.infraestructura.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.adn.aplicacion.comando.ComandoTipoDocumento;
import co.com.adn.aplicacion.manejador.tipodocumento.ManejadorCrearTipoDocumento;
import co.com.adn.aplicacion.manejador.tipodocumento.ManejadorListarTipoDocumento;

@RestController
@RequestMapping(value = "/tipo_documentos")
public class TipoDocumentoControlador {

	private final ManejadorCrearTipoDocumento manejadorCrearTipoDocumento;
	private final ManejadorListarTipoDocumento manejadorListarTipoDocumento;
	
	public TipoDocumentoControlador(ManejadorCrearTipoDocumento manejadorCrearTipoDocumento,
			ManejadorListarTipoDocumento manejadorListarTipoDocumento) {
		this.manejadorCrearTipoDocumento = manejadorCrearTipoDocumento;
		this.manejadorListarTipoDocumento = manejadorListarTipoDocumento;
	}
	
	@PostMapping
	public void crear(@RequestBody ComandoTipoDocumento comandoTipoDocumento) {
		this.manejadorCrearTipoDocumento.ejecutar(comandoTipoDocumento);
	}
	
	@PostMapping(path = "/todos")
	public void crearTodos(@RequestBody List<ComandoTipoDocumento> listComandoTipoDocumentos) {
		for (ComandoTipoDocumento comandoTipoDocumento : listComandoTipoDocumentos) {
			this.manejadorCrearTipoDocumento.ejecutar(comandoTipoDocumento);
		}
	}
	
	@GetMapping
	public List<ComandoTipoDocumento> listar() {
		return this.manejadorListarTipoDocumento.listar();
	}
	
}
