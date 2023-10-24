package co.com.adn.infraestructura.adaptador.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.adn.aplicacion.comando.ComandoAdministradoraPension;
import co.com.adn.dominio.modelo.AdministradoraPension;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraPension;
import co.com.adn.infraestructura.entidad.AdministradoraPensionEntity;
import co.com.adn.infraestructura.jpa.AdministradoraPensionJPA;

@Repository
public class RepositorioAdministradoraPensionJPA implements RepositorioAdministradoraPension {

	@Autowired
	private AdministradoraPensionJPA administradoraPensionJPA;
	
	@Autowired
	private ModelMapper modelMapper;

	public RepositorioAdministradoraPensionJPA(AdministradoraPensionJPA administradoraPensionJPA) {
		this.administradoraPensionJPA = administradoraPensionJPA;
	}

	@Override
	public void crear(AdministradoraPension administradoraPension) {
		AdministradoraPensionEntity administradoraPensionEntity = modelMapper.map(administradoraPension, AdministradoraPensionEntity.class);
		this.administradoraPensionJPA.save(administradoraPensionEntity);
	}

	@Override
	public List<ComandoAdministradoraPension> listar() {
		List<ComandoAdministradoraPension> listComandoAdministradoraPension = new ArrayList<>();
		List<AdministradoraPensionEntity> listAdministradoraPensionEntities = this.administradoraPensionJPA.findAlls();
		for (AdministradoraPensionEntity administradoraPensionEntity : listAdministradoraPensionEntities) {
			ComandoAdministradoraPension comandoAdministradoraPension =  modelMapper.map(administradoraPensionEntity, ComandoAdministradoraPension.class);
			listComandoAdministradoraPension.add(comandoAdministradoraPension);
		}
		return listComandoAdministradoraPension;
	}
}
