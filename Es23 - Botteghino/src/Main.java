
public class Main {

	public static void main(String[] args) {
		// classe programmazione string film int ora int numero posti
		Botteghino b = new Botteghino();
		System.out.println(b);
		b.prenota("film 4", 10);
		System.out.println(b);
		b.prenota("film 1", 10);
		System.out.println(b);
		b.disdici("film 5", 10);
		System.out.println(b);
		b.disdici("film 4", 10);
		System.out.println(b);
		b.disdici("film 1", 10);
		System.out.println(b);
	}

}
