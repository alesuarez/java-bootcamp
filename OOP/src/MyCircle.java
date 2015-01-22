



public class MyCircle {
	private MyPoint center;
	private int radius;
	
	
	public MyCircle(int x,int y,int radius){
		center = new MyPoint(x,y);
		this.radius=radius;
	}
	public MyCircle(MyPoint center,int radius){
		this.center=center;
		this.radius=radius;
	}
//GETTERS
	public int getCenterX(){return center.getX();}
	public int getCenterY(){return center.getY();}
	public int getRadius(){return radius;}
	public double getArea(){return Math.pow(radius,2)*Math.PI;}
//SETTERS
	public void setCenterXY(int x,int y){center.setXY(x,y);}

//METHODS
	public String toString(){
		return "Circle @ ("+this.getCenterX()+","+this.getCenterY()+") radius="+this.getRadius();
	}
	
	}

