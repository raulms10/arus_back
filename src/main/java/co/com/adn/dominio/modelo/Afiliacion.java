package co.com.adn.dominio.modelo;

import java.text.ParseException;
import java.util.Date;

import co.com.adn.dominio.validador.ValidadorParametro;
import co.com.adn.infraestructura.compartido.FormateadorFecha;
/**
 * @author raul.martinez
 */
public class Afiliacion {
	
	private static final String EL_AFILIADO_ES_DATO_OBLIGATORIO = "El Afiliado es un dato obligatorio.";
	private static final String LA_ADMINISTRADORA_SALUD_ES_DATO_OBLIGATORIO = "La Administradora de Salud es un dato obligatorio.";
	private static final String LA_FECHA_AFILIACION_SALUD_ES_DATO_OBLIGATORIO = "La fecha de afiliación a salud es un dato obligatorio.";
	private static final String LA_ADMINISTRADORA_PENSION_ES_DATO_OBLIGATORIO = "La Administradora de Pensión es un dato obligatorio.";
	private static final String LA_FECHA_AFILIACION_PENSION_ES_DATO_OBLIGATORIO = "La fecha de afiliación a pensión es un dato obligatorio.";
	
	private String codigo;
	private Afiliado afiliado;
	private AdministradoraSalud administradoraSalud;
	private Date fechaAfiliacionSalud;
	private AdministradoraPension administradoraPension;
	private Date fechaAfiliacionPension;
	
	public Afiliacion(Afiliado afiliado, AdministradoraSalud administradoraSalud, Date fechaAfiliacionSalud,
			AdministradoraPension administradoraPension, Date fechaAfiliacionPension) {
		//Se valida datos obligatorios
		ValidadorParametro.validarObligatorio(afiliado, EL_AFILIADO_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(administradoraSalud, LA_ADMINISTRADORA_SALUD_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(fechaAfiliacionSalud, LA_FECHA_AFILIACION_SALUD_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(administradoraPension, LA_ADMINISTRADORA_PENSION_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(fechaAfiliacionPension, LA_FECHA_AFILIACION_PENSION_ES_DATO_OBLIGATORIO);
		
		//Se crea la Afiliacion
		try {
			this.codigo = afiliado.getNumeroDocumento() + "_" + FormateadorFecha.getDate(new Date());
		} catch (ParseException e) {
			this.codigo = afiliado.getNumeroDocumento();
			// e.printStackTrace();
		}
		this.afiliado = afiliado;
		this.administradoraSalud = administradoraSalud;
		this.fechaAfiliacionSalud = fechaAfiliacionSalud;
		this.administradoraPension = administradoraPension;
		this.fechaAfiliacionPension = fechaAfiliacionPension;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Afiliado getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(Afiliado afiliado) {
		this.afiliado = afiliado;
	}

	public AdministradoraSalud getAdministradoraSalud() {
		return administradoraSalud;
	}

	public void setAdministradoraSalud(AdministradoraSalud administradoraSalud) {
		this.administradoraSalud = administradoraSalud;
	}

	public Date getFechaAfiliacionSalud() {
		return fechaAfiliacionSalud;
	}

	public void setFechaAfiliacionSalud(Date fechaAfiliacionSalud) {
		this.fechaAfiliacionSalud = fechaAfiliacionSalud;
	}

	public AdministradoraPension getAdministradoraPension() {
		return administradoraPension;
	}

	public void setAdministradoraPension(AdministradoraPension administradoraPension) {
		this.administradoraPension = administradoraPension;
	}

	public Date getFechaAfiliacionPension() {
		return fechaAfiliacionPension;
	}

	public void setFechaAfiliacionPension(Date fechaAfiliacionPension) {
		this.fechaAfiliacionPension = fechaAfiliacionPension;
	}
}
