package parte3;

public class LineSub extends Point{
	
	Point end;
	public LineSub (int beginX, int beginY, int endX, int endY) {
	      super(beginX, beginY);             
	      this.end = new Point(endX, endY);  
	   }
	   public LineSub (Point begin, Point end) {  
	      super(begin.getX(), begin.getY());      
	      this.end = end;
	   }
	   
	  public String toString() {
	  return "A LineSub end:"+end+", which is a subclass of Point"+super.toString();
	  }
	   
	   
	}

