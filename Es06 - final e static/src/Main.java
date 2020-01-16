
public class Main {

	public static void main(String[] args) {
		
		Calcolatrice x = new Calcolatrice();
		x.circonferenza(2);
		
		System.out.println("Chiamo il metodo statico: ");
		Calcolatrice.circonferenzaS(5);
	}
}
