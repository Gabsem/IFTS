import java.util.ArrayList;

public class Botteghino {
	
	private ArrayList<Programmazione> programmazioni;
	//private ArrayList<String> clienti;
	//costruttore senza parametri, inizializza l'arraylist
	public Botteghino() {
		programmazioni=new ArrayList<Programmazione>();
		//clienti=new ArrayList<String>();
		programmazioni.add(new Programmazione("film 1", 10, 100));
		programmazioni.add(new Programmazione("film 2", 8, 5));
		programmazioni.add(new Programmazione("film 3", 9, 20));
		programmazioni.add(new Programmazione("film 4", 10, 0));
	}
	// prenota
	public void prenota(String nomeFilm, int orario) {
		boolean trovato = false;
		for(int i=0; i<programmazioni.size(); i++) {
			//1. cercare se il nome del film è presente nel botteghino
			if(this.programmazioni.get(i).getNome().equalsIgnoreCase(nomeFilm)) {
				trovato = true;
				//2.cercare se l'orario è disponibile
				if(this.programmazioni.get(i).getOra()== orario) {
					trovato = true;
					//3. decrementare i posti
					if(this.programmazioni.get(i).getNumPosti()>0) {
						trovato = true;
						this.programmazioni.get(i).setNumPosti(this.programmazioni.get(i).getNumPosti()-1);
						System.out.println("Prenotato per il film"+nomeFilm+" alle "+orario);
						return;
					} else {
						System.out.println("Posti non disponibili");
					}
				}else {
					System.out.println("Orario non disponibile");
				}
			}
		}
		if(!trovato) {
			System.out.println("Film non disponibile");
		}
	}
	//disdici
	public void disdici(String nome, int orario) {
		for(int i=0; i<programmazioni.size();i++) {
			if(this.programmazioni.get(i).getNome().equalsIgnoreCase(nome)) {
				if(this.programmazioni.get(i).getOra()== orario){
					this.programmazioni.get(i).setNumPosti(this.programmazioni.get(i).getNumPosti()+1);
					System.out.println("Prenotazione del film "+nome+ " alle ore "+orario+" rimossa");
					return;
				}
			}
		}
		System.out.println("Orario o nome film non trovato");
	}
	@Override
	public String toString() {
		return "\n Botteghino [programmazioni=" + programmazioni + "]"+"\n";
	}
}
