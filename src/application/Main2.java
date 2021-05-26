package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator1;

public class Main2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Calculator1 calc = new Calculator1();
		
		System.out.print("Enter radius: ");
		double radius = teclado.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
			
		teclado.close();
	}

}
