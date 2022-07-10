package interamais.front.comModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_User")
public class User {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long IdUser;
	private @NotNull @Size(min = 1, max = 100) String Nome;
	private @NotNull @Size(min = 1, max = 100) String Sobrenome;
	private @NotNull @Size(min = 1, max = 100) String Email;
	private @NotNull @Size(min = 1, max = 100) String Senha;
	private @NotNull @Size(min = 1, max = 100) int Telefone;
	
	
	public long getIdUser() {
		return IdUser;
	}
	public void setIdUser(long idUser) {
		IdUser = idUser;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	
	
  
}
