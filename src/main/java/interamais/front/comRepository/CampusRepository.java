package interamais.front.comRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import interamais.front.comModel.Campus;

public interface CampusRepository extends JpaRepository<Campus, Long>{
	public List<Campus> findAllByTituloContainingIgnoreCase (String NomeCampus);
}
