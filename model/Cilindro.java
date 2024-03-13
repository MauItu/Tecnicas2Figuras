package model;

public class Cilindro extends Circulo {
	private double altura;
	
	@Override
	public double calcularVolumen() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2)*altura;
	}

	public Cilindro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cilindro(double x, double y, double radio, double altura) {
		super(x, y, radio);
		this.altura=altura;
		// TODO Auto-generated constructor stub
	}

	public Cilindro(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + "]";
	}	
	
}
