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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import interamais.front.comModel.Cronograma;
import interamais.front.comRepository.CronogramaRepository;

@RestController
@RequestMapping("/cronograma")
@ResponseStatus(HttpStatus.OK)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CronogramaController {
	@Autowired
	private CronogramaRepository cronogramaRepository;

	@GetMapping(value = "listatodos") // primeiro método de API
	@ResponseBody // retorna os dados par ao corpo da resposta
	public ResponseEntity<List<Cronograma>> GetAll() {
		List<Cronograma> cronograma = cronogramaRepository.findAll();
		return ResponseEntity.ok(cronogramaRepository.findAll()); //retorna em json 
	}
   //o metodo findAll Vem do repository.
	
}
