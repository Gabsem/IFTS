
public class Utente {
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private String iban;
	private Double saldo;
	public Utente(String nome, String cognome, String username, String password, String iban, Double saldo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.iban = iban;
		this.saldo = saldo;
	}
	public Utente() {
		super();
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "\nUtente [nome=" + nome + ", cognome=" + cognome + ", username=" + username + ", password=" + password + ", iban="
				+ iban + ", saldo=" + saldo + "]";
	}
	
}
	