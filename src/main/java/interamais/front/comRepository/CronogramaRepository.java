package interamais.front.comRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import interamais.front.comModel.Cronograma;

@Repository
public interface CronogramaRepository extends JpaRepository<Cronograma, Long>{
	
	public List<Cronograma> findAllByTituloContainingIgnoreCase (Long IdCronograma);
	
}
