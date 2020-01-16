
public class Main {

	public static void main(String[] args) {
		Cellulare a = new Cellulare(0);
		a.ricarica(20);
		a.chiama(20);
		System.out.println("Il tuo credito dopo una chiamata di 20 min è: "+a.numero404());
		a.chiama(63);
		System.out.println("Il tuo credito dopo una chiamata di 60 min è: "+a.numero404());
		System.out.println("Hai effettuato: "+a.getNumeroChiamate()+" chiamate");
		a.azzeraChiamate();
		System.out.println("Ho azzerato le chiamate "+a.getNumeroChiamate());
	}

}
