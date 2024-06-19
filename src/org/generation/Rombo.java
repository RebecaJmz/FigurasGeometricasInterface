package org.generation;

public class Rombo implements FiguraGeometrica {

	private String nombre;
	private double diagonalMa;
	private double diagonalMe;
	private double lado;
	
	
public Rombo(String nombre, double diagonalMa, double diagonalMe, double lado) {
		
		this.nombre = nombre;
		this.diagonalMa   = diagonalMa;
		this.diagonalMe = diagonalMe;
		this.lado   = lado;
		
	}//constructor


public double CalcularArea() {
	
	return (diagonalMa*diagonalMe)/2;
	
}//CalcularArea


public double CalcularPerimetro(){
	
	return (4*lado);
	
}//CalcularPerimetro


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public double getDiagonalMa() {
	return diagonalMa;
}


public void setDiagonalMa(double diagonalMa) {
	this.diagonalMa = diagonalMa;
}


public double getDiagonalMe() {
	return diagonalMe;
}


public void setDiagonalMe(double diagonalMe) {
	this.diagonalMe = diagonalMe;
}


public double getLado() {
	return lado;
}


public void setLado(double lado) {
	this.lado = lado;
}


@Override
public String toString() {
	return "Rombo [nombre=" + nombre + ", diagonalMa=" + diagonalMa + ", diagonalMe=" + diagonalMe + ", lado=" + lado
			+ ", CalcularArea()=" + CalcularArea() + ", CalcularPerimetro()=" + CalcularPerimetro() + ", getNombre()="
			+ getNombre() + ", getDiagonalMa()=" + getDiagonalMa() + ", getDiagonalMe()=" + getDiagonalMe()
			+ ", getLado()=" + getLado() + "]";
}





}//classRombo
