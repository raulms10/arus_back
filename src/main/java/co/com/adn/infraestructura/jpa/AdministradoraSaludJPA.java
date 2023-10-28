package co.com.adn.infraestructura.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.adn.infraestructura.entidad.AdministradoraSaludEntity;

@Repository
public interface AdministradoraSaludJPA extends JpaRepository<AdministradoraSaludEntity, String> {
	
	@Query("SELECT a FROM AdministradoraSaludEntity a")
	List<AdministradoraSaludEntity> findAlls();
}
