package sources;

public class Prodotto {
	private String nome;
	private Double prezzo; 
	//wrapper Double Integer
	private Integer quantita;
	private String codice;
	public Prodotto(String nome, Double prezzo, Integer quantita, String codice) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.codice = codice;
	}
	public Prodotto() {

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", prezzo=" + prezzo + ", quantita=" + quantita + ", codice=" + codice + "]";
	}
		
}
