
public class Main {

	public static void main(String[] args) {
		Dipendente a = new Dipendente();
		a.setNome("Gabriele");
		a.setStipendio(2000);
		System.out.println("Dipendente: "+a.toString());
		a.aumento(10);
		System.out.println("Dipendente: "+a.toString());
		System.out.println("Dipendente: "+a.toString());
		
	}

}
