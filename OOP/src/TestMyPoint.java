

public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1=new MyPoint(3,0);
		MyPoint p2=new MyPoint(0,4);
		int i;
		MyPoint[] point = new MyPoint[10];
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(5, 6));
		p1.setX(4);
		System.out.println(p1.toString());
		for (i=0;i<10;i++){
			point[i]=new MyPoint(i+1,i+1);
		}
		
		for(i=0;i<10;i++){
			System.out.println("Punto Nro: "+i+"->"+point[i].toString());
		}
	}

}
