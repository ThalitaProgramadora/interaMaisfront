package interamais.front.comModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_Campus")
public class Campus {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long IdCampus;
	private @NotNull @Size(min = 1, max = 20) Integer NomeCampus;
	
	public long getIdCampus() {
		return IdCampus;
	}
	public void setIdCampus(long idCampus) {
		IdCampus = idCampus;
	}
	public Integer getNomeCampus() {
		return NomeCampus;
	}
	public void setNomeCampus(Integer nomeCampus) {
		NomeCampus = nomeCampus;
	}
	
	
}
