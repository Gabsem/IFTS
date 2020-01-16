
public class Tabellina {
	private int n=0;

	public Tabellina() {
		}

	public Tabellina(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	public void tab() {
		for(int i=0;i<=10;i++) {
			int temp=0;
			//2.4.6.8.10
			//0*2;1*2;2*2;3*2;4*2;5*2;6*2;7*2;8*2;
			temp=this.n*i;
			//perchè va oltre?
			System.out.println("La tebellina di "+n+" è: "+temp);
		}
	}
}
