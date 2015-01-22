package Parte2.Parte2;

public class Square extends Rectangle{
	public Square(){
		super();
	}
	public Square(double side){
		super(side,side);
	}
	public Square(double side,String color,boolean filled){
		super(side,side,color,filled);
	}
	public double getSide(){return super.getLength();}
	public void setSide(double side){
		super.setLength(side);
		super.setWidth(side);
	}
@Override
	public String toString(){
	return "A Square with side="+super.getLength()+", which is a subclass of "+super.toString();
	}
@Override
	public void setLength(double length){
		super.setLength(length);
		super.setWidth(length);
	}
	
@Override
public void setWidth(double width){
		super.setLength(width);
		super.setWidth(width);
		}
}
