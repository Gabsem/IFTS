package sources;

import java.util.ArrayList;

public class Distributore {
	private Double saldo;
	private ArrayList<Prodotto> prodotti;
	
	public Distributore() {
		super();
	}

	public Distributore(Double saldo, ArrayList<Prodotto> prodotti) {
		super();
		this.saldo = saldo;
		this.prodotti = prodotti;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	@Override
	public String toString() {
		return "Distributore [saldo=" + saldo + ", prodotti=" + prodotti + "]";
	}
	

}

