import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		int eta;
		 System.out.println("Inserisci il tuo nome...");
		 nome = scanner.nextLine();
		 System.out.println("Ciao "+ nome+".");
		 System.out.println("Inserisci la tua età...");
		 eta = scanner.nextInt();
		 System.out.println("Hai "+eta+ " anni.");
		 System.out.println("Ti chiami "+nome+" e hai "+eta+ " anni.");
		 scanner.close();
	}

}
