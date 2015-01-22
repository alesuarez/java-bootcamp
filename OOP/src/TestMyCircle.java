


public class TestMyCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCircle circulo1 = new MyCircle(1,2,8);
		MyPoint punto2 = new MyPoint(5,3);
		MyCircle circulo2 = new MyCircle(punto2,4);
		
		System.out.println(circulo1.toString());
		System.out.println(circulo2.toString());
		
	}

}
