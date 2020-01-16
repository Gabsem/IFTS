import interfacce.Calcolatrice;
import interfacce.Saluta;
import interfacce.Torcia;

public class Telefono implements Torcia, Saluta, Calcolatrice{
	private String marca;
	private String modello;
	public Telefono() {
		
	}
	public Telefono(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	@Override
	public void accendiTorcia() {
		System.out.println("Ho acceso la torcia");
	}
	@Override
	public void spegniTorcia() {
		System.out.println("Ho spento la torcia");
	}
	@Override
	public void somma(int a, int b) {
		System.out.println("La somma tra "+a+ " e "+b+" è: "+(a+b));
	}
	@Override
	public void moltiplicazione(int a, int b) {
		System.out.println("La moltiplicazione tra "+a+" e "+b+ " è: "+(a*b));
	}
	@Override
	public void divisione(int a, int b) {
		System.out.println("La divisione tra "+a+" e "+b+" è: "+(a/b));
	}
	
}
