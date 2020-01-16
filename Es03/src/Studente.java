
public class Studente extends Persona {
	private String matricola;

	public Studente() {
		super();
		//System.out.println("Costruttore senza parametri della classe studente");
		
	}
	public Studente(String matricola) {
		super();
		//System.out.println("Costruttore senza parametri della classe studente");
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public void visualizzaInfo () {
		super.visualizzaInfo();
		System.out.println("matricola: "+ matricola);
	}
}
