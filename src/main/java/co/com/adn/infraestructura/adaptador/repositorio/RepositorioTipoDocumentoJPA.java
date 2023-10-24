package co.com.adn.infraestructura.adaptador.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.adn.aplicacion.comando.ComandoTipoDocumento;
import co.com.adn.dominio.modelo.TipoDocumento;
import co.com.adn.dominio.repositorio.RepositorioTipoDocumento;
import co.com.adn.infraestructura.entidad.TipoDocumentoEntity;
import co.com.adn.infraestructura.jpa.TipoDocumentoJPA;

@Repository
public class RepositorioTipoDocumentoJPA implements RepositorioTipoDocumento {

	@Autowired
	private final TipoDocumentoJPA tipoDocumentoJPA;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public RepositorioTipoDocumentoJPA(TipoDocumentoJPA tipoDocumentoJPA) {
		this.tipoDocumentoJPA = tipoDocumentoJPA;
	}

	@Override
	public void crear(TipoDocumento tipoDocumento) {
		TipoDocumentoEntity tipoDocumentoEntity = modelMapper.map(tipoDocumento, TipoDocumentoEntity.class);
		tipoDocumentoJPA.save(tipoDocumentoEntity);		
	}

	@Override
	public List<ComandoTipoDocumento> listar() {
		List<ComandoTipoDocumento> listComandoTiposDoc = new ArrayList<>();
		List<TipoDocumentoEntity> listEntitiesTipoDoc = tipoDocumentoJPA.findAlls();
		for (TipoDocumentoEntity tipoDocumentoEntity : listEntitiesTipoDoc) {
			ComandoTipoDocumento comandoTipoDocumento = modelMapper.map(tipoDocumentoEntity, ComandoTipoDocumento.class);
			listComandoTiposDoc.add(comandoTipoDocumento);
		}
		return listComandoTiposDoc;
	}
}
