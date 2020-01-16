
public class Potenza {
	private int m =0;
	private int p =0;

	public Potenza() {
	}

	public Potenza(int m) {
		this.m = m;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}
	public void pot(int p) {
		//moltiplicare il numero per se stesso per n volte=potenza
		//devo ciclare per p volte
		//creo il for che mi moltiplichi più volte lo stesso numero
		//restituire il risultato
		int temp=1;
		for(int i=0;i<p;i++) {
			
			//temp=this.m*(this.m*p);
			temp*=this.m;
			
		}
		System.out.println("Il risultato della potenza di "+m+" alla "+p+"° é:"+temp);
	}
}
