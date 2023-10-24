package co.com.adn.infraestructura.adaptador.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.adn.aplicacion.comando.ComandoAfiliacion;
import co.com.adn.dominio.modelo.Afiliacion;
import co.com.adn.dominio.repositorio.RepositorioAfiliacion;
import co.com.adn.infraestructura.entidad.AfiliacionEntity;
import co.com.adn.infraestructura.jpa.AfiliacionJPA;

@Repository
public class RepositorioAfiliacionJPA implements RepositorioAfiliacion {

	@Autowired
	private final AfiliacionJPA afiliacionJPA;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public RepositorioAfiliacionJPA(AfiliacionJPA afiliacionJPA) {
		this.afiliacionJPA = afiliacionJPA;
	}

	@Override
	public void crear(Afiliacion afiliacion) {
		AfiliacionEntity afiliacionEntity = modelMapper.map(afiliacion, AfiliacionEntity.class);
		this.afiliacionJPA.save(afiliacionEntity);
	}

	@Override
	public boolean existe(Afiliacion afiliacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ComandoAfiliacion> listar() {
		List<ComandoAfiliacion> listComandoAfiliacion = new ArrayList<>();
		List<AfiliacionEntity> listAfiliacionEntities = this.afiliacionJPA.findAlls();
		for (AfiliacionEntity afiliacionEntity : listAfiliacionEntities) {
			ComandoAfiliacion comandoAfiliacion = modelMapper.map(afiliacionEntity, ComandoAfiliacion.class);
			listComandoAfiliacion.add(comandoAfiliacion);
		}
		return listComandoAfiliacion;
	}

}
