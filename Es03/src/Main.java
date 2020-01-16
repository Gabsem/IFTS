
public class Main {

	public static void main(String[] args) {
		Studente x = new Studente ("8847");
		Studente y = new Studente ("8849");
		Persona z = new Persona();
		Lavoratore w = new Lavoratore ("Gabreiele ", "Grassi ", 1500.0);
		z.setNome("luigi ");
		z.setCognome("Baldo ");
		x.setNome("Mario ");
		y.setNome("Fabio ");
		x.setCognome("Sardo ");
		y.setCognome("Derivato ");
		y.visualizzaInfo();
		x.visualizzaInfo();
		z.visualizzaInfo();
		w.visualizzaInfo();
	}
	
}
