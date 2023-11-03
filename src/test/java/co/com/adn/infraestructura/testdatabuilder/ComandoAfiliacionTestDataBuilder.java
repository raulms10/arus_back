package co.com.adn.infraestructura.testdatabuilder;

import java.util.Date;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.aplicacion.comando.ComandoAfiliado;

public class ComandoAfiliacionTestDataBuilder {

	private String codigo;
	private ComandoAfiliado comandoAfiliado;
	private ComandoAdministradoraSalud comandoAdministradoraSalud;
	private Date fechaAfiliacionSalud;
	private ComandoAdministradoraPension comandoAdministradoraPension;
	private Date fechaAfiliacionPension;
	
	public ComandoAfiliacionTestDataBuilder() {
		this.codigo = "AF001";
		this.comandoAfiliado = new ComandoAfiliadoTestDataBuilder().build();
		this.comandoAdministradoraSalud = new ComandoAdministradoraSaludTestDataBuilder().build();
		this.fechaAfiliacionSalud = new Date();
		this.comandoAdministradoraPension = new ComandoAdministradoraPensionTestDataBuilder().build();
		this.fechaAfiliacionPension = new Date();
	}
	
	public ComandoAfiliacionTestDataBuilder conCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public ComandoAfiliacionTestDataBuilder conAfiliado(ComandoAfiliado comandoAfiliado) {
		this.comandoAfiliado = comandoAfiliado;
		return this;
	}
	
	public ComandoAfiliacionTestDataBuilder conAdministradoraSalud(ComandoAdministradoraSalud comandoAdministradoraSalud) {
		this.comandoAdministradoraSalud = comandoAdministradoraSalud;
		return this;
	}
	
	public ComandoAfiliacionTestDataBuilder conFechaAfiliacionSalud(Date fechaAfiliacionSalud) {
		this.fechaAfiliacionSalud = fechaAfiliacionSalud;
		return this;
	}
	
	public ComandoAfiliacionTestDataBuilder conAdministradoraPension(ComandoAdministradoraPension administradoraPension) {
		this.comandoAdministradoraPension = administradoraPension;
		return this;
	}
	
	public ComandoAfiliacionTestDataBuilder conFechaAfiliacionPension(Date fechaAfiliacionPension) {
		this.fechaAfiliacionPension = fechaAfiliacionPension;
		return this;
	}
	
	public ComandoAfiliacion build() {
		return new ComandoAfiliacion(codigo, comandoAfiliado, comandoAdministradoraSalud, fechaAfiliacionSalud, comandoAdministradoraPension, fechaAfiliacionPension);
	}
}
