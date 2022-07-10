package interamais.front.comController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import interamais.front.comModel.User;
import interamais.front.comRepository.ReservaRepository;
import interamais.front.comRepository.UserRepository;

@RestController
@RequestMapping("/reserva")
@ResponseStatus(HttpStatus.OK)
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public ResponseEntity<List<User>> GetAll() {
		return ResponseEntity.ok(userRepository.findAll());
	}

	@GetMapping("/{Id}")
	public ResponseEntity<User> GetById(@PathVariable int id) {
		return userRepository.findById(Id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<User> postReserva(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(user));
	}

	@PutMapping
	public ResponseEntity<User> putReserva(@RequestBody User reserva) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(user));
	}

	@DeleteMapping("/{IdDelete}")
	public void deleteReserva(@PathVariable long id) {
		userRepository.deleteById(id);
	}
}
