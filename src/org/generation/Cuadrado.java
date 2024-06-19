package org.generation;

public class Cuadrado implements FiguraGeometrica {

	private String nombre;
	private double lado;
	
 
	public Cuadrado(String nombre, double lado) {
		
		this.nombre = nombre;
		this.lado   = lado;
		
	}//constructor

	
	
	public double CalcularArea() {
		
		return lado*lado;
		
	}//CalcularArea
	
	
	public double CalcularPerimetro(){
		
		return 4*lado;
		
	}//CalcularPerimetro



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + ", CalcularArea()=" + CalcularArea()
				+ ", CalcularPerimetro()=" + CalcularPerimetro() + ", getNombre()=" + getNombre() + ", getLado()="
				+ getLado() + "]";
	}
	
	
	
	
	
	
}//classMain
