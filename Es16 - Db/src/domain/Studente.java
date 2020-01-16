package domain;

public class Studente {
	private Integer id;
	private String nome;
	private String cognome;
	private String matricola;
	
	public Studente() {
	}
	
	public Studente(Integer id, String nome, String cognome, String matricola) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}
	
	
}
