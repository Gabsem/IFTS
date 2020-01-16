
public class DistributoreDiBenzina {
	private double deposito;
	private double euroPerLitro;
	
	public DistributoreDiBenzina(double unPrezzoPerLitro) {
		this.deposito=0;
		this.euroPerLitro = unPrezzoPerLitro;
	}
	public void rifornisci(double unaQuantita) {
		this.deposito+=unaQuantita;
	}
	public void aggiorna(double unPrezzoPerLitro) {
		this.euroPerLitro=unPrezzoPerLitro;
	}
	public void vendi(double euro) {
		double l =0;
		if(l>this.deposito) {
			
		}
		else {
			
		}
		l=euro/this.euroPerLitro;
		System.out.println("Hai effettuato un rifornimento di "+l+" litri di benzina");
		
	}
	public double getEuroPerLitro() {
		return euroPerLitro;
	}
	public void setEuroPerLitro(double euroPerLitro) {
		this.euroPerLitro = euroPerLitro;
	}
		
}
