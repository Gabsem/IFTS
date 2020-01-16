import java.util.ArrayList;

public class Autorimessa {
	private ArrayList <String> box;
	public Autorimessa() {
		this.box = new ArrayList<String>();
	}
	public Autorimessa(ArrayList<String> box) {
		this.box = box;
	}
	private int cercaTarga(String unaTarga) {
		//cercare una targa nell'arraylist
		//intero
		for(String targa:box) {
			if(targa.equalsIgnoreCase(unaTarga)) {
				return 1;
			}
			}
		return 0;
	}
		public void parcheggia(String unaTarga) {
		//inserire un auto nell'autorimessa
		//se la targa è uguale non viene parcheggiata
			if(cercaTarga(unaTarga)==1) {
			System.out.println("Targa già presente "+unaTarga);	
		}else {
			box.add(unaTarga);
		}
	}
	public void rimuovi(String unaTarga) {
		if(cercaTarga(unaTarga)==1) {
			box.remove(unaTarga);
			
		}else {
			System.out.println("La targa "+unaTarga+" non è presente");
		}
		//togliere un auto dall'autorimessa
	}
	public int numeroAuto() {
		return box.size();
	}
}
