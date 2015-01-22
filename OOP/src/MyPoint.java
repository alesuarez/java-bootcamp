

public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	public MyPoint(){
		x=0;
		y=0;
	}
	
// SETTERS
	public void setX(int x){this.x=x;}
	public void setY(int y){this.y=y;}
	public void setXY(int x,int y){
		this.x=x;
		this.y=y;
	}
//GETTERS
	public int getX(){return x;}
	public int getY(){return y;}
//METHODS
	public String toString(){
		return "("+x+","+y+")";
	}
	public double distance(int x,int y){
		int xDiff = this.x-x;
		int yDiff = this.y-y;
		return Math.sqrt(xDiff*xDiff+yDiff*yDiff); // (x^2 + y^2)^1/2 distancia entre dos puntos
	}
	public double distance(MyPoint another){
		return distance(another.getX(),another.getY());		
	}

}
