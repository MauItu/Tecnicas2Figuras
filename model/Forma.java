package model;

public class Forma {
	
	private double X;
	private double Y;
	private double area;
	
	public double calcularVolumen() {
		return 0;
	}
	
	public double calcularArea() {
		return 0;
	}
	
	public double perimetro() {
			return 0;
	}
	
	public Forma() {
		
	}
	
	public Forma(double x, double y) {
		X = x;
		Y = y;
	}

	public double getX() {
		return X;
	}

	public void setX(double x) {
		X = x;
	}

	public double getY() {
		return Y;
	}

	public void setY(double y) {
		Y = y;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Forma [X=" + X + ", Y=" + Y + "]";
	}
	
	

}
