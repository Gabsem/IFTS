
public class Main {

	public static void main(String[] args) {
		Fattoriale x = new Fattoriale();
		x.setA(5);
		x.fact();
		System.out.println("Il fattoriale di "+x.getA()+ " è: "+x.fact());
	}

}
