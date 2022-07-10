package interamais.front.comRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import interamais.front.comModel.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{
	public List<Reserva> findAllByTituloContainingIgnoreCase (String NomeEquip);
}
