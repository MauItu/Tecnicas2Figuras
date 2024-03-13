package controller;

import java.util.ArrayList;

import model.*;
import view.Ventana;

public class Controlador {

	ArrayList<Forma>misFiguritas=new ArrayList();//Lista heterogeneas
	
	
	public void arrancar() {
		registrarFiguras();
		Ventana.mostrarTitulo();
		for(Forma circulito: misFiguritas) {
			Ventana.imprimirTabla(null, circulito.getX(), circulito.getY(), circulito.getArea(), circulito.perimetro(),0);

		}
	
	
		
	}
	public void registrarFiguras() { //precargar datos
		
		Circulo circulito= new Circulo(2.3,3.5,15);
		misFiguritas.add(circulito);
		misFiguritas.add (new Circulo(3.3,1.5,15));
		misFiguritas.add (new Forma (4,1.));
		misFiguritas.add (new Rectangulo(3,3));
	}

}
