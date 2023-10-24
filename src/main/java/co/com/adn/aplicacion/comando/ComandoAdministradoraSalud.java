package co.com.adn.aplicacion.comando;

public class ComandoAdministradoraSalud {
	
	private String codigo;
	private String nombre;
	
	public ComandoAdministradoraSalud(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public ComandoAdministradoraSalud() { }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
