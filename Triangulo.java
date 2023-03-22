package entities;

public class Triangulo {

	public double LadoA;
	public double LadoB;
	public double LadoC;
	
	public double area() {
		double p = (LadoA + LadoB + LadoC) / 2.0;
		return Math.sqrt(p * (p - LadoA) * (p - LadoB) * (p - LadoC));
	}
}
