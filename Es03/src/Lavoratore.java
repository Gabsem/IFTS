
public class Lavoratore extends Persona {

	private double stipendio;
	public Lavoratore() {
		// TODO Auto-generated constructor stub
	}

	public Lavoratore(String nome, String cognome, double stipendio) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public void visualizzaInfo() {
		super.visualizzaInfo();
		System.out.println("Il mio stipendio è: "+ this.getStipendio());
		
	}
}
