package interamais.front.comRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import interamais.front.comModel.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public List<User> findAllByTituloContainingIgnoreCase (String Nome);
	public Optional<User> findByUsuario (String Nome);
}
