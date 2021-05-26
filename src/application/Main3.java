package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator2;

public class Main3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = teclado.nextDouble();
		
		double c = Calculator2.circumference(radius);
		
		double v = Calculator2.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator2.PI);
			
		teclado.close();
	}

}
