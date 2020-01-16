
public class Persona {
	private String nome;
	private String cognome;
	
	public void saluta() {
		System.out.println("Ciao ");
	}

	public Persona() {
		//System.out.println("Costruttore senza parametri della classe persona");	
	}

	public Persona(String nome, String cognome) {
		//System.out.println("Costruttore con parametri della classe persona");
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void visualizzaInfo () {
		System.out.println("nome: " + nome + "cognome: " + cognome);
	}

}
