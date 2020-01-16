
public class Fattoriale {
	private int a =0;

	public Fattoriale() {
	}

	public Fattoriale(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	public int somma() {
		int result = 0;
			for(int i=a;i>=0;i--) {
			result +=i;
		}
			return result;
		}
	}

