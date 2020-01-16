package interfacce;

public interface Calcolatrice {
	public void somma (int a, int b);
	public void moltiplicazione (int a, int b);
	public void divisione (int a, int b);
	
	public default void sottrazione (int a, int b) {
		System.out.println(a + "- "+b+" = "+(a-b));
	}
}
