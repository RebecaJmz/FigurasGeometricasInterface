package org.generation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Triangulo bermudas = new Triangulo("Bermudas", 20, 10, 15);	
	Triangulo t = new Triangulo("TrianguloTE", 250, 175, 145);	
	Cuadrado c1 = new Cuadrado("Cuadrado1",5);
	Rectangulo r1 = new Rectangulo("Rec1", 2,5);
	Rombo ro1 = new Rombo("Rom1", 12, 10, 8);
	Trapecio tra1 = new Trapecio("Tra1",12,10,9,5,5);
	
	imprimirCalculo(bermudas);
	imprimirCalculo(t);
	imprimirCalculo(c1);
	imprimirCalculo(r1);
	imprimirCalculo(ro1);
	imprimirCalculo(tra1);


	}// main
	
	public static void imprimirCalculo(FiguraGeometrica f) {
		
		System.out.println(f.toString());
		System.out.println("+===============================+");
		System.out.println("|El Área de [" + f.getNombre() + "] es " + f.CalcularArea());
		System.out.println("|El Perímetro de [" + f.getNombre() + "] es " + f.CalcularPerimetro());
		System.out.println("+===============================+");

	}//imprimirCalcular
	

}//class Main
