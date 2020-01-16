
public class Programmazione {
	private String nome;
	private int ora;
	private int numPosti;
	public Programmazione(String nome, int ora, int numPosti) {
		this.nome = nome;
		this.ora = ora;
		this.numPosti = numPosti;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getOra() {
		return ora;
	}
	public void setOra(int ora) {
		this.ora = ora;
	}
	public int getNumPosti() {
		return numPosti;
	}
	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}
	@Override
	public String toString() {
		return "\n Programmazione [nome=" + nome + ", ora=" + ora + ", numPosti=" + numPosti + "]";
	}
}
