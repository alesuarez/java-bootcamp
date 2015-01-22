package parte3;

public class Line {
	private Point begin;
	private Point end;
	
	public Line(Point begin,Point end){
		this.begin=begin;
		this.end=end;
	}
	public Line(int beginX,int beginY,int endX,int endY){
		begin = new Point(beginX,beginY);
		end = new Point(endX,endY);
	}
	
}
