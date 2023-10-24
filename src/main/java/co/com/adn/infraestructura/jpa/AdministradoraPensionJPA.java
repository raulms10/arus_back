package co.com.adn.infraestructura.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.adn.infraestructura.entidad.AdministradoraPensionEntity;


@Repository
public interface AdministradoraPensionJPA extends JpaRepository<AdministradoraPensionEntity, String>{
	
	@Query("SELECT * FROM AdministradoraPension")
	List<AdministradoraPensionEntity> findAlls();
}
