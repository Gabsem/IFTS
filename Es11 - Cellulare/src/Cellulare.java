
public class Cellulare {
	private double credito;
	private int numeroChiamate;
	
	public Cellulare (double unaRicarica) {
		this.credito = unaRicarica;
		this.numeroChiamate =0;
	}
	
	public void ricarica(double unaRicarica) {
		this.credito += unaRicarica;
		//this.setCredito(this.getCredito()+unaRicarica);
		//this.credito = this.credito + unaRicarica;
	}
	public void chiama (double minutiDurata) {
		//incrementare numero delle chiamate
		this.numeroChiamate++;
		//il costo è di 0.20 euro al minuto
		//quindi devo decrementare il credito
		
		//this.credito = this.credito - (0.20*minutiDurata);
		this.credito -= (0.20*minutiDurata);
		
	}
	public double numero404() {
		return this.credito;
	}
	public void azzeraChiamate() {
		this.numeroChiamate = 0;
	}
	public int getNumeroChiamate() {
		return numeroChiamate;
	}

	public void setNumeroChiamate(int numeroChiamate) {
		this.numeroChiamate = numeroChiamate;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

}
