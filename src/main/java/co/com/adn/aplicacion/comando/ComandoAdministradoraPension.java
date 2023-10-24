package co.com.adn.aplicacion.comando;

public class ComandoAdministradoraPension {
	
	private String codigo;
	private String nombre;
	
	public ComandoAdministradoraPension(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public ComandoAdministradoraPension() {	}
	
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
