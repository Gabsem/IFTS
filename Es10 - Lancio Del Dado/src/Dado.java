import java.util.Random;

public class Dado {
	private int numeroFacce;

	public Dado() {
		this.numeroFacce = 6;
	}

	public Dado(int numeroFacce) {
		this.numeroFacce = numeroFacce;
	}

	public int getNumeroFacce() {
		return numeroFacce;
	}

	public void setNumeroFacce(int numeroFacce) {
		this.numeroFacce = numeroFacce;
	}
	
	public int lancio() {
		int result = new Random().nextInt(this.numeroFacce)+1;
		return result;
	}
}
