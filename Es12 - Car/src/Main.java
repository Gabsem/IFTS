
public class Main {

	public static void main(String[] args) {
		System.out.println("Rifornimento...");
		DistributoreDiBenzina x = new DistributoreDiBenzina(1.32);
		x.vendi(20);
		x.aggiorna(1.49);
		System.out.println("Il prezzo al litro è stato aggiornato");
		x.vendi(20);
	}

}
