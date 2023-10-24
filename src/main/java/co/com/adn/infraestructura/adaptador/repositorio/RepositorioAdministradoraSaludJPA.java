package co.com.adn.infraestructura.adaptador.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.adn.aplicacion.comando.ComandoAdministradoraSalud;
import co.com.adn.dominio.modelo.AdministradoraSalud;
import co.com.adn.dominio.repositorio.RepositorioAdministradoraSalud;
import co.com.adn.infraestructura.entidad.AdministradoraSaludEntity;
import co.com.adn.infraestructura.jpa.AdministradoraSaludJPA;

@Repository
public class RepositorioAdministradoraSaludJPA implements RepositorioAdministradoraSalud {

	@Autowired
	private final AdministradoraSaludJPA administradoraSaludJPA;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public RepositorioAdministradoraSaludJPA(AdministradoraSaludJPA administradoraSaludJPA) {
		this.administradoraSaludJPA = administradoraSaludJPA;
	}

	@Override
	public void crear(AdministradoraSalud administradoraSalud) {
		AdministradoraSaludEntity administradoraSaludEntity = modelMapper.map(administradoraSalud, AdministradoraSaludEntity.class);
		this.administradoraSaludJPA.save(administradoraSaludEntity);
	}

	@Override
	public List<ComandoAdministradoraSalud> listar() {
		List<ComandoAdministradoraSalud> listComandoAdministradoraSalud = new ArrayList<>();
		List<AdministradoraSaludEntity> administradoraSaludEntities = this.administradoraSaludJPA.findAlls();
		for (AdministradoraSaludEntity administradoraSaludEntity : administradoraSaludEntities) {
			ComandoAdministradoraSalud comandoAdministradoraSalud = modelMapper.map(administradoraSaludEntity, ComandoAdministradoraSalud.class);
			listComandoAdministradoraSalud.add(comandoAdministradoraSalud);
		}
		return listComandoAdministradoraSalud;
	}
}
