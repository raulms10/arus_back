package co.com.adn.infraestructura.adaptador.repositorio;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.adn.dominio.modelo.Afiliado;
import co.com.adn.dominio.repositorio.RepositorioAfiliado;
import co.com.adn.infraestructura.entidad.AfiliadoEntity;
import co.com.adn.infraestructura.jpa.AfiliadoJPA;

@Repository
public class RepositorioAfiliadoJPA implements RepositorioAfiliado {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private final AfiliadoJPA afiliadoJPA;
	
	public RepositorioAfiliadoJPA(AfiliadoJPA afiliadoJPA) {
		this.afiliadoJPA = afiliadoJPA;
	}

	@Override
	public void crear(Afiliado afiliado) {
		AfiliadoEntity afiliadoEntity = this.modelMapper.map(afiliado, AfiliadoEntity.class);
		this.afiliadoJPA.save(afiliadoEntity);		
	}
}
