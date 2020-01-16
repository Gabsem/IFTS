
public class Dipendente {
	private String nome;
	private double stipendio;
	
	public Dipendente() {
		super();
	}

	public Dipendente(String nome, double stipendio) {
		super();
		this.nome = nome;
		this.stipendio = stipendio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public void aumento(double percentuale) {
		this.stipendio+=(this.stipendio*percentuale)/100;
		System.out.println("Il tuo nuovo stipendio è di:"+this.stipendio+" euro");
	}

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", stipendio=" + stipendio + "]";
	}
	
}
