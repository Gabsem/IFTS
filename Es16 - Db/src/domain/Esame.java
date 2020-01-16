package domain;

public class Esame {
	private Integer id;
	private Integer cfu;
	private String codice;
	private String nome;
	
	public Esame() {
		
	}
	
	public Esame(Integer id, Integer cfu, String codice, String nome) {
		super();
		this.id = id;
		this.cfu = cfu;
		this.codice = codice;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCfu() {
		return cfu;
	}

	public void setCfu(Integer cfu) {
		this.cfu = cfu;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Esame [id=" + id + ", cfu=" + cfu + ", codice=" + codice + ", nome=" + nome + "]";
	}
	
}