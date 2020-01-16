
public class Main {

	public static void main(String[] args) {
		Dado d6 = new Dado (20);
		Dado d2 = new Dado (10);
		System.out.println("d6 ha "+ d6.getNumeroFacce()+" facce");
		System.out.println("Lancio un dado con "+ d6.getNumeroFacce()+" facce");
		System.out.println("Ed il risultato è: "+d6.lancio());
		System.out.println("Il risultato del lancio del dado con "+d2.getNumeroFacce()+" facce è: "+d2.lancio());
	
		
	}

}
