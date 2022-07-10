package interamais.front.comModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_Cronograma")
public class Cronograma {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long IdCronograma;
	private @NotNull @Size(min = 1, max = 100) Integer NomeEquip;
	private @NotNull @Size(min = 1, max = 100) Integer NomeCampus;
	private @NotNull @Size(min = 1, max = 100) Integer TempoReserva;//dias
	// private @ManyToOne @JsonIgnoreProperties("cronograma") Tema tema;
	// private @ManyToOne @JsonIgnoreProperties("cronograma") Usuario usuario;
	
	public long getIdCronograma() {
		return IdCronograma;
	}
	public void setIdCronograma(long idCronograma) {
		IdCronograma = idCronograma;
	}
	public Integer getNomeEquip() {
		return NomeEquip;
	}
	public void setNomeEquip(Integer nomeEquip) {
		NomeEquip = nomeEquip;
	}
	public Integer getNomeCampus() {
		return NomeCampus;
	}
	public void setNomeCampus(Integer nomeCampus) {
		NomeCampus = nomeCampus;
	}
	public Integer getTempoReserva() {
		return TempoReserva;
	}
	public void setTempoReserva(Integer tempoReserva) {
		TempoReserva = tempoReserva;
	}
	


}

