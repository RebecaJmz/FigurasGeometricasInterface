package org.generation;

public class Trapecio  implements FiguraGeometrica{

	private String nombre;
	private double baseMa;
	private double baseMe;
	private double altura;
	private double lado1;
	private double lado2;

	
public Trapecio(String nombre, double baseMa, double baseMe,double altura, double lado1, double lado2) {
		
		this.nombre = nombre;
		this.baseMa   = baseMa;
		this.baseMe = baseMe;
		this.altura = altura;
		this.lado1   = lado1;
		this.lado2 = lado2;
		
	}//constructor

	

public double CalcularArea() {
	
	return (altura*(baseMa+baseMe))/2;
	
}//CalcularArea


public double CalcularPerimetro(){
	
	return (baseMa + baseMe + lado1 + lado2);
	
}//CalcularPerimetro



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public double getBaseMa() {
	return baseMa;
}



public void setBaseMa(double baseMa) {
	this.baseMa = baseMa;
}



public double getBaseMe() {
	return baseMe;
}



public void setBaseMe(double baseMe) {
	this.baseMe = baseMe;
}



public double getAltura() {
	return altura;
}



public void setAltura(double altura) {
	this.altura = altura;
}



public double getLado1() {
	return lado1;
}



public void setLado1(double lado1) {
	this.lado1 = lado1;
}



public double getLado2() {
	return lado2;
}



public void setLado2(double lado2) {
	this.lado2 = lado2;
}



@Override
public String toString() {
	return "Trapecio [nombre=" + nombre + ", baseMa=" + baseMa + ", baseMe=" + baseMe + ", altura=" + altura
			+ ", lado1=" + lado1 + ", lado2=" + lado2 + ", CalcularArea()=" + CalcularArea() + ", CalcularPerimetro()="
			+ CalcularPerimetro() + ", getNombre()=" + getNombre() + ", getBaseMa()=" + getBaseMa() + ", getBaseMe()="
			+ getBaseMe() + ", getAltura()=" + getAltura() + ", getLado1()=" + getLado1() + ", getLado2()=" + getLado2()
			+ "]";
}



	
}//classTrapecio
