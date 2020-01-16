
public class Prenotazione {
	private String nome;
	private int ora; //fascia oraria da 1 a 8
	public Prenotazione(String nome, int ora) {
		this.nome = nome;
		this.ora = ora;
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
	@Override
	public String toString() {
		return "Prenotazione [nome=" + nome + ", ora=" + ora + "]";
	}
}
