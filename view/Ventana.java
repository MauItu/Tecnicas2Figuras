package view;

public class Ventana {
	public static void mostrarTitulo() {
		System.out.format("%14s %16s %14s %16s %14s %16s %n","Figura", "Lado1","lado2", "Area", "Perimetro", "Radio");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

	}

	public static void imprimirTabla(String fig, double l1, double l2,double Area, double per, double rad) {
		System.out.format("%14s %16s %14s %16s %14s %16s %n",fig, l1, l2, Area, per, rad);
	}
}
