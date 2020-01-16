package interfacce;

public interface Saluta {
	public default void ciao() {
		System.out.println("Ciao");
	}
}
