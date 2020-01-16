import java.util.ArrayList;

public class Banca {
	private ArrayList<Utente> utenti;

	public Banca() {
		super();
	}

	public Banca(ArrayList<Utente> utenti) {
		super();
		this.utenti = utenti;
	}

	public ArrayList<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(ArrayList<Utente> utenti) {
		this.utenti = utenti;
	}

	@Override
	public String toString() {
		return "Banca [utenti=" + utenti + "]";
	}
	
	/*public void deposito(double ammontare, Utente u) {
		u.setSaldo(u.getSaldo()+ammontare);
	}
	public void prelievo(double ammontare, Utente u) {
		u.setSaldo(u.getSaldo()-ammontare);
	}*/
	public void depositoPrelievo(double ammontare, Utente u) {
		//se ammontare < 0 allora è un prelievo
		//se ammontare > 0 allora è un deposito
		//controllare che il saldo sia sufficiente
		if(u.getSaldo()>ammontare * -1) {
			u.setSaldo(u.getSaldo()+ammontare);
		}else {
			System.out.println("Vai a lavorare poveraccio");
		}
	}
	public void bonifico(double ammontare, Utente ordinante, String iban) {
		// controllare l'iban
		this.depositoPrelievo(ammontare, ordinante);
	}
	//login
	public Utente login(String usr, String pwd) {
		for (int i=0; i<this.utenti.size(); i++) {
			Utente temp = this.utenti.get(i);
			if (temp.getUsername().equals(usr) && temp.getPassword().equals(pwd)) {
				return temp;
			}
		}
		return null;
	}
}
