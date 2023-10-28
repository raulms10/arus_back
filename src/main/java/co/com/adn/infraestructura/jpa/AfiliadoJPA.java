package co.com.adn.infraestructura.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.adn.infraestructura.entidad.AfiliadoEntity;

@Repository
public interface AfiliadoJPA extends JpaRepository<AfiliadoEntity, String> {

	@Query("SELECT a FROM AfiliadoEntity a")
	List<AfiliadoEntity> findAlls();
	
}
