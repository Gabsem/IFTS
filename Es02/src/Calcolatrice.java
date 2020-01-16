
public class Calcolatrice {
	
	/*public  int somma (int x, int y) {
		int z = x+y;
		return z;
	}*/

	
	public int sottrazzione (int a, int b) {
		return a-b;
	}
	public int moltiplicazione (int a, int b) {
		return a*b;
		}
		// va in overloading rispetto alla funzione di sopra
    	// firma = nome funzione + parametri in input
		/*public void moltiplicazone (double a, double b) {
			System.out.println("a * b =" +(a*b));
          }*/
	public int somma (int a, int b) {
		return a+b;
	}
	/*public double somma(double a, double b) {
		return a+b;
	}*/
	
	public int divisione(int a, int b) {
		int result = 0;
		try {	
		return result = a/b;
		} catch (ArithmeticException e) {			
			System.err.println("ln"+e+"ln");
		}
		return result;
	}
	/*public int divisioneThrow(int a, int b) throws Exception{
		return a/b;
	}*/
	/*public divisione();
	public sottrazione();
	public moltiplicazione();*/
}
