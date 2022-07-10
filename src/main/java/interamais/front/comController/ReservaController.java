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

import interamais.front.comModel.Reserva;
import interamais.front.comRepository.ReservaRepository;

@RestController
@RequestMapping("/reserva")
@ResponseStatus(HttpStatus.OK)
@CrossOrigin("*")
public class ReservaController {
	@Autowired
	private ReservaRepository reservaRepository;

	@GetMapping
	public ResponseEntity<List<Reserva>> GetAll() {
		return ResponseEntity.ok(reservaRepository.findAll());
	}

	@GetMapping("/{Id}")
	public ResponseEntity<Reserva> GetById(@PathVariable int id) {
		return reservaRepository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Reserva> postReserva(@RequestBody Reserva reserva) {
		return ResponseEntity.status(HttpStatus.CREATED).body(reservaRepository.save(reserva));
	}

	@PutMapping
	public ResponseEntity<Reserva> putReserva(@RequestBody Reserva reserva) {
		return ResponseEntity.status(HttpStatus.CREATED).body(reservaRepository.save(reserva));
	}

	@DeleteMapping("/{IdDelete}")
	public void deleteReserva(@PathVariable long id) {
		reservaRepository.deleteById(id);
	}
}
