import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		// nome, prezzo, quantita, codice
		prodotti.add(new Prodotto("acqua", 0.5, 10, "A001"));
		prodotti.add(new Prodotto("caffe", 0.55, 7, "A002"));
		prodotti.add(new Prodotto("mars", 1.5, 3, "A003"));
		prodotti.add(new Prodotto("kinder bueno", 2.5, 0, "A004"));
		prodotti.add(new Prodotto("pepsi", 1.0, 5, "A005"));
		
		System.out.println("Prodotti: "+ prodotti.toString());
		
		String codice= "A006";
		double saldo = 10.0;
		boolean trovato = false;
		//devo controllare che il codice sia corretto
		
		for(int i = 0; i < prodotti.size(); i++) {
			Prodotto temp = prodotti.get(i);
			if(codice.equalsIgnoreCase(temp.getCodice())) {//codice == temp.get(codice)
				//ho trovato il prodotto
				trovato=true;
				if(temp.getQuantita()>0) {
					//è disponibile
					if(saldo >= temp.getPrezzo()) {
						//te lo puoi permettere, non sei un poveraccio
						System.out.println("Erogazione in corso..." + temp.getNome());
						temp.setQuantita(temp.getQuantita()-1); //la modifica si propaga all'arraylist
						saldo = saldo - temp.getPrezzo();
						System.out.println("Prodotti: "+ prodotti.toString());
					}
					else {
						// non te lo puoi permettere
						System.out.println("Mi spiace non hai abbastanza soldi per" +temp.getNome());
					}
				} else {
					System.out.println("Prodoto: "+ temp.getNome()+" non disponibile");
				}
			} 
		}// chiude il for
		if(!trovato) {
			System.out.println("Prodotto non trovato");
		}
		System.out.println("Fine programma");
	}

}
