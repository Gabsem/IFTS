import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		System.out.println("Ciao");
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Inserisci il valore di a...");
		a = scanner.nextInt();
		System.out.println("Inserisci il valore di b...");
		b = scanner.nextInt();
		scanner.close();
		Calcolatrice calc = new Calcolatrice();
		int risultato = 0;
		risultato = calc.somma(a, b);
		System.out.println("La somma tra a e b è: "+ risultato);
		risultato = calc.sottrazzione(a, b);
		System.out.println("La sottrazione tra a e b è: "+ risultato );
		risultato = calc.divisione(a, b);
		System.out.println("La divisione tra a e b è = "+risultato);
		risultato = calc.moltiplicazione(a, b);
		System.out.println("La moltiplicazione tra a e b è= "+risultato);
		System.out.println("FINE PROGRAMMA");
		/*int res = 0;
		try {
			res = calc.divisioneThrow(10,0);
		}
		finally {
		}*/
		/*System.out.println("Creazione di un vettore di 5 elementi: ");
		Scanner scanner1 = new Scanner(System.in);
		int x;
		int y;
		int z;
		int w;
		int j;
		System.out.println("Inserire i valori del vettore:");
		System.out.println("Primo valore...");
		x = scanner1.nextInt();
		System.out.println("Secondo valore...");
		y = scanner1.nextInt();
		System.out.println("Terzo valore...");
		z = scanner1.nextInt();
		System.out.println("Quarto valore...");
		w = scanner1.nextInt();
		System.out.println("Quinto valore...");
		j = scanner1.nextInt();
		scanner1.close();
		System.out.println("Array");
		int[] numeri = new int[5];
		numeri [0] = x;
		numeri [1] = y;
		numeri [2] = z;
		numeri [3] = w;
		numeri [4] = j;
		
		for(int i=0; i<5; i++) {
			if(i % 2 == 0) {
		System.out.println("valore: " + numeri[i]);
			}
		}
		System.out.println("for each output");
		for(int numero: numeri) {
			System.out.println("numero "+ numero);
		}*/
	}
}
