import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//stampare domanda "vuoi continuare"
		//attende dati dall'utente
		//se l'utente immette s si ok certo perchè no
		//stampare "OK"
		//se l'utente immette n No stampare "fine"
		//non considerare maiuscolo e minuscolo
		//in tutti gli altri casi stampare dato non corretto
		System.out.println("Vuoi continuare?");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		switch (input.toLowerCase()) {
			case "s":
			case "si":
			case "ok":
			case "certo":	
			case "perchè no":{
					System.out.println("Ok");
				break;
			}
			case "n":
			case"no":{
						System.out.println("Fine");
				break;
			}
			default: {
				System.out.println("Errore di immissione..");
			}
		}
	}

}
