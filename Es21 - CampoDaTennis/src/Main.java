
public class Main {

	public static void main(String[] args) {
		Campo a = new Campo();
		a.addPren(2, "Gabriele");
		System.out.println("Campi "+a.toString());
		a.removePren(2, "Gabriele");
		a.addPren(3, "Marco");
		a.addPren(5, "Simone");
		a.addPren(5, "Andrea");
		System.out.println("Campi "+a.toString());
		a.removePren(2, "Simone");
		a.removePren(1, "Ale");
		a.removePren(2, "Simone");
		System.out.println("Campi "+a.toString());
		}
}
