
public class Auto {
	private String marca;
	private int cilindrata;
	private String modello;
	
	public Auto(String marca, int cilindrata, String modello) {
		this.marca = marca;
		this.cilindrata = cilindrata;
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", cilindrata=" + cilindrata + ", modello=" + modello + "]";
	}
}
