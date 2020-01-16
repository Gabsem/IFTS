import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Banca banca = new Banca();
		ArrayList<Utente> utenti = new ArrayList<Utente>();
		utenti.add(new Utente("Pippo", "Franco", "pippo.franco", "PF", "ITPIPPOFRANCO5487", 11000.00 ));
		utenti.add(new Utente("Santo", "Stefano", "s.s", "iide", "ITSANTOSTEF4649", 110000.00 ));
		banca.setUtenti(utenti);
		System.out.println("Utenti:"+ banca.toString()+"\n\n");
		
		//menu che permetta di fare bonifico/prelievo/deposito dopo aver fatto la login
		Scanner scan = new Scanner(System.in);
			System.out.println("Inserire username:...");
			String usr=scan.nextLine();
			System.out.println("Inserire password:...");
			String pwd=scan.nextLine();
			Utente loggedUser = banca.login(usr, pwd);
			if(loggedUser == null) {
				System.out.println("uesernam o password errati");
				System.exit(0);
			}
			System.out.println("Logged as"+loggedUser.toString());
			Integer choice =0;
		while (choice!=4) {
			System.out.println("Scegli l'operazione da fare:");
			System.out.println("1.Prelievo");
			System.out.println("2.Deposito");
			System.out.println("3.Bonifico");
			System.out.println("4.Esci");
			choice = scan.nextInt();
			switch(choice){
				case 1:{
					System.out.println("Quanto vuoi prelevare?");
					double importo = scan.nextDouble();
					banca.depositoPrelievo(importo*-1, loggedUser);
					System.out.println("Info: "+loggedUser.toString());
					break;
				}
				case 2:{
					System.out.println("Inserire l'importo:");
					double importo = scan.nextDouble();
					banca.depositoPrelievo(importo, loggedUser);
					System.out.println("Info: "+loggedUser.toString());
					break;
				}
				case 3:{
					System.out.println("Inserire l'importo:");
					double importo = scan.nextDouble();
					scan.nextLine();
					System.out.println("Inserire l'iban del beneficiario:");
					String iban = scan.nextLine();
					/*	boolean trovato =false;
						for(i = 0; i< banca.getUtenti().size(); i++) {
							Utente temp = banca.getUtenti().get(i);
							if(iban.equalsIgnoreCase(temp.getIban()) {
								
							}*/
							banca.bonifico(importo, loggedUser, iban);
						}
							
					System.out.println("Info: "+loggedUser.toString());
					break;
				
				case 4:{
					System.out.println("Grazie per aver utilizzato la banca Java");
					break;
				}
				default:{
					System.out.println("Scelta non ammessa");
				}
			scan.close();}
			
			
		}
		
		/*String usr = "pippo.franco";
		String pwd = "PF";
		
		Utente loggedUser = banca.login(usr, pwd);
		if(loggedUser == null) {
			System.out.println("uesernam o password errati");
			System.exit(0);
		}
		System.out.println("Logged as"+loggedUser.toString());
		
		//banca.depositoPrelievo(-99.0, loggedUser);
		banca.bonifico(-12090, loggedUser, "ciccio");
		System.out.println("Dopo deposito:"+loggedUser.toString());
	}*/

}
}
