import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//realizzare un programma che
		//acquisisce da tastiera qualunque numero
		//ed esce nel momento in cui inserisco -1
		System.out.println("Inizio");
		ArrayList<Integer>numeri=new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Inserisci un numero...");
			Integer temp;
			temp= scan.nextInt();
			if(temp == -1) {
				break;
			}
			numeri.add(temp);
		}
		System.out.println("Hai inserito: "+numeri.toString());
		scan.close();
	}

}
