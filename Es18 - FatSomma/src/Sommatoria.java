
public class Sommatoria {
	private int n=0;

	public Sommatoria() {
		super();
	}

	public Sommatoria(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	public int somma() {
			//trovare i numeri pari
		//trovare i numeri dispari
		//sommare solo i numeri pari
		//sommare solo i numeri dispari
		int result1 =0;
		int result2=0;
		for(int i=0;i<=n;i=i+2) {
				if((i%2)==0) {
				return	result1=result+i;
					
				}else {
				return	result2=result+i;
				}
		}
		
	}
}
