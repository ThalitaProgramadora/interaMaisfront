package interamais.front.comModel;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_Reserva")
public class Reserva {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long IdReserva;
	private @NotNull @Size(min = 1, max = 100) String NomeEquip;
	private @NotNull @Size(min = 1, max = 100) String MarcaEquip;
	private @NotNull @Size(min = 1, max = 100) String DescriEquip;
	private @NotNull @Size(min = 1, max = 100) int QuantidadeEquip;
	private @NotNull @Size(min = 1, max = 100) String StatusReserva;
	private @NotNull @Size(min = 1, max = 100) int CodCampus;
	private @NotNull @Size(min = 1, max = 100) String NomeCampus;
	private @NotNull @Size(min = 1, max = 100) String TempoReserva;
	private @NotNull @Size(min = 1, max = 100) String NomeCategoria;
	private @Temporal(TemporalType.TIMESTAMP) Date dateInit = new java.sql.Date(System.currentTimeMillis());
	private @Temporal(TemporalType.TIMESTAMP) Date dateFim = new java.sql.Date(System.currentTimeMillis());
	
	
	public long getId() {
		return IdReserva;
	}
	public void setId(long id) {
		this.IdReserva = id;
	}
	public String getNomeEquip() {
		return NomeEquip;
	}
	public void setNomeEquip(String nomeEquip) {
		NomeEquip = nomeEquip;
	}
	public String getMarcaEquip() {
		return MarcaEquip;
	}
	public void setMarcaEquip(String marcaEquip) {
		MarcaEquip = marcaEquip;
	}
	public String getDescriEquip() {
		return DescriEquip;
	}
	public void setDescriEquip(String descriEquip) {
		DescriEquip = descriEquip;
	}
	public int getQuantidadeEquip() {
		return QuantidadeEquip;
	}
	public void setQuantidadeEquip(int quantidadeEquip) {
		QuantidadeEquip = quantidadeEquip;
	}
	public String getStatusReserva() {
		return StatusReserva;
	}
	public void setStatusReserva(String statusReserva) {
		StatusReserva = statusReserva;
	}
	public int getCodCampus() {
		return CodCampus;
	}
	public void setCodCampus(int codCampus) {
		CodCampus = codCampus;
	}
	public String getNomeCampus() {
		return NomeCampus;
	}
	public void setNomeCampus(String nomeCampus) {
		NomeCampus = nomeCampus;
	}
	public String getTempoReserva() {
		return TempoReserva;
	}
	public void setTempoReserva(String tempoReserva) {
		TempoReserva = tempoReserva;
	}
	public String getNomeCategoria() {
		return NomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		NomeCategoria = nomeCategoria;
	}
	public Date getDateInit() {
		return dateInit;
	}
	public void setDateInit(Date dateInit) {
		this.dateInit = dateInit;
	}
	public Date getDateFim() {
		return dateFim;
	}
	public void setDateFim(Date dateFim) {
		this.dateFim = dateFim;
	}
	
}
