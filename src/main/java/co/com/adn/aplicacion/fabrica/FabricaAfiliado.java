package co.com.adn.aplicacion.fabrica;

import org.springframework.stereotype.Component;

import co.com.adn.aplicacion.comando.ComandoAfiliado;
import co.com.adn.dominio.modelo.Afiliado;
import co.com.adn.dominio.modelo.TipoDocumento;
import co.com.adn.dominio.validador.ValidadorParametro;

@Component
public class FabricaAfiliado {
	
	private static final String EL_AFILIADO_ES_DATO_OBLIGATORIO = "El Afiliado es un dato obligatorio.";
	private static final String EL_TIPO_DOCUMENTO_ES_DATO_OBLIGATORIO = "El tipo de documento del Afiliado es un dato obligatorio.";

	private final FabricaTipoDocumento fabricaTipoDocumento;

	public FabricaAfiliado(FabricaTipoDocumento fabricaTipoDocumento) {
		this.fabricaTipoDocumento = fabricaTipoDocumento;
	}

	public Afiliado crearAfiliado(ComandoAfiliado comandoAfiliado) {
		
		ValidadorParametro.validarObligatorio(comandoAfiliado, EL_AFILIADO_ES_DATO_OBLIGATORIO);
		ValidadorParametro.validarObligatorio(comandoAfiliado.getTipoDocumento(), EL_TIPO_DOCUMENTO_ES_DATO_OBLIGATORIO);
		
		TipoDocumento tipoDocumento = this.fabricaTipoDocumento.crearTipoDocumento(comandoAfiliado.getTipoDocumento());
		return new Afiliado(tipoDocumento, comandoAfiliado.getNumeroDocumento(), comandoAfiliado.getPrimerNombre(),
				comandoAfiliado.getSegundoNombre(), comandoAfiliado.getPrimerApellido(),
				comandoAfiliado.getSegundoApellido());
	}
}
