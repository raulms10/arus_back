package co.com.adn.infraestructura.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.adn.infraestructura.entidad.AfiliacionEntity;

@Repository
public interface AfiliacionJPA extends JpaRepository<AfiliacionEntity, String> {
	
	@Query("SELECT * FROM AfiliacionEntity")
	List<AfiliacionEntity> findAlls();
}
