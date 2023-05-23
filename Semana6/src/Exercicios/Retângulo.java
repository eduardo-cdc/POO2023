package Exercicios;

public class Retângulo {
	private double altura;
	private double largura;
	
	public Retângulo(double altura, double largura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}
	
	public double CalcularArea(double altura,double largura) {
		double area = altura * largura;
		return area;
	}
	public double CalcuraPerimetro(double altura,double largura) {
		double perimetro = (2*altura) + (2*largura);
		return perimetro;
	}
	
}