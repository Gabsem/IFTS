import java.util.ArrayList;
import java.util.Scanner;

public class Vettore {

	public static void main(String[] args) {
		System.out.println("Creazione di un vettore di 5 elementi: ");
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
		/*for(int i=0; i<5; i++) {
			if(i % 2 == 0) {
		System.out.println("valore: " + numeri[i]);
			}
		}*/
		//System.out.println("for each output");
		for(int numero: numeri) {
			System.out.println("numero "+ numero);
		}
		ArrayList<Integer> num = new ArrayList<Integer>();
			num.add(5);
			num.add(5648);
		 System.out.println("Numeri.size: "+ num.size());
		 
		 String a = "Ciao";
			 System.out.println("y.lenght: " + a.length());
			 
			 int[] array = new int[3];
			 System.out.println("array.length: "+ array.length);
	}
	
}
	  
	 


