package Parte2;



public class circle {
// DECLARACION DE VARIABLES PRIVADAS
	private double radius;
	private String color;
	
//CONSTRUCTORES
	
	public circle(){
		radius=1.0; // valor por defecto
		color="red"; // valor por defecto
	}
	public circle(double R,String C){
		radius=R;
		color=C;
	}
	public circle(double radius){
		this.radius=radius;
		color="red";
	}
// METODOS
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return Math.pow(radius,2)*Math.PI;
	}
	public String getColor(){
		return color;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public void setColor(String C){
		color=C;
	}
	public String toString(){
		return "Circulo: radio= "+radius+" color="+color;
	}

}
