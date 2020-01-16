import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//scrivere un programma che riceva 
		//tre numeri double come dati di ingresso
		//per poi stamparli in ordine crescente
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire il valore di a...");
		double a = scan.nextDouble();
		System.out.println("Inserire il valore di b...");
		double b = scan.nextDouble();
		System.out.println("Inserire il valore di c...");
		double c = scan.nextDouble();
		scan.close();
		System.out.println("Ordinamento in ordine crescente:");
		if(a>b && a>c) {
			System.out.print("a,");
			if(b>c) {
				System.out.println("b,c ");
			}else
			{
				System.out.println("c,b ");
			}
		}
		if(b>a && b>c) {
				System.out.print("b,");
			if(c>a) {
				System.out.println("c,a ");
			}else {
				System.out.println("a,c");
			}
		}
		if(c>a && c>b) {
			System.out.print("c,");
			if(b>a) {
				System.out.println("b,a");
			}else {
				System.out.println("a,b");
			}
		}
	}
	}

