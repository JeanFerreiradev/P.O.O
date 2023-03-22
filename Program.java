package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner console = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();	
		y = new Triangulo();
		
		System.out.println("Digite os lados do triângulo X: ");
		x.LadoA = console.nextDouble();
		x.LadoB = console.nextDouble();
		x.LadoC = console.nextDouble();
		
		System.out.println("Digite os lados do triângulo Y: ");
		y.LadoA = console.nextDouble();
		y.LadoB = console.nextDouble();
		y.LadoC = console.nextDouble();
		
		double areaX = x.area();
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		
		double areaY = y.area();
		
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("maior area: X");
		} else {
			System.out.println("maior area: Y");
		}
		
		console.close();

	}

}
