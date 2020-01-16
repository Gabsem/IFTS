import java.util.ArrayList;

public class Campo {
	private ArrayList <Prenotazione> prenotazioni;
	public Campo() {
		this.prenotazioni= new ArrayList<Prenotazione>();
	}
	public boolean addPren(int ora, String unNome) {
		if(cercaPren(ora)!=-1) {
			System.out.println("Campo occupato");
			return false;
		}else {
			this.prenotazioni.add(new Prenotazione(unNome, ora));
			System.out.println("Campo prenotato a nome "+unNome+" in fascia oraria "+ora);
			return true;
		}
	}
	public boolean removePren(int ora, String unNome) {
		int index = cercaPren(ora);
		if(index!=-1) {
			this.prenotazioni.remove(index);
			System.out.println("Prenotazione rimossa");
			return true;
		}else {
			System.out.println("Prenotazione non trovata");
			return false;
		}
	}
	private int cercaPren(int ora) {
		for(int i=0; i<this.prenotazioni.size();i++) {
			Prenotazione temp = this.prenotazioni.get(i);
			if(temp.getOra()==ora) {
				return i;
			}
		}
		return -1;
	}
	//public boolean changePren(int newOra, String newNome, int oldOra, String oldNome) {
	//	int oldIndex = cercaPren(oldOra);
//	}
	@Override
	public String toString() {
		return "Campo [prenotazioni=" + prenotazioni + "]";
	}
}
