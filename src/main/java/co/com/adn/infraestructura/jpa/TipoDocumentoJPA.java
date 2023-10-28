package co.com.adn.infraestructura.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.adn.infraestructura.entidad.TipoDocumentoEntity;

@Repository
public interface TipoDocumentoJPA extends JpaRepository<TipoDocumentoEntity, String> {
	
	@Query("SELECT t FROM TipoDocumentoEntity t")
	List<TipoDocumentoEntity> findAlls();

}
