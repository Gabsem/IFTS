package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import sources.Distributore;
import sources.Prodotto;

public class Main {

	public static void main(String[] args) {
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();	
		//inserisco i numeri nell'ArrayList
		Distributore distr = new Distributore();

		distr.setSaldo(0.0);
		distr.setProdotti(prodotti);
		
		prodotti.add(new Prodotto("Mars", 1.50, 3, "A001"));
		prodotti.add(new Prodotto("Acqua", 0.50, 10, "A002"));
		
		
		System.out.println(distr.toString() + "\n\n");

		//interazione
		Integer choice = 0;
		while(choice != 3) {
			System.out.println("scegli l'operazione da effettuare...");
			System.out.println("1 inserisci una moneta");
			System.out.println("2 seleziona un prodotto");
			System.out.println("3 esci");
			Scanner scan = new Scanner (System.in);
			choice = scan.nextInt();
		switch(choice) {
				case 1: {
						System.out.println("Inserisci una moneta (0.5, 1, 2)");
						double moneta = 0.0;
						try {
						moneta = scan.nextDouble();
						} catch(InputMismatchException e) {
							System.err.println(e);
						}
						distr.setSaldo(distr.getSaldo() + moneta); //aggiorno il saldo
						
							System.out.println("Nuovo saldo: " + distr.getSaldo());
						break;
						}
				case 2: {
					break;
				}
				case 3: {
					System.out.println("Erogazione del resto: " + distr.getSaldo());
					break;
				}
			} // Fine switch
		} // Fine while	
		System.out.println("Grazie per aver utilizzato il distributore Java");
	} // Fine main
	
} //Fine Main

//Array dinamico
/*ArrayList<Integer> numeri = new ArrayList<Integer>();	
//inserisco i numeri nell'ArrayList
for(int i = 0; i<5 ; i++) {
numeri.add(i*2)
numeri.get(3);
Per prendere un valore all'interno dell'array.
}*/