


public class TestCircle {

	public static void main(String[] args) {
		
		
			// TODO Auto-generated method stub
			circle circulo = new circle(); // circulo unitario
			System.out.println("El circulo tiene area: "+circulo.getArea()+" y es de radio: "+circulo.getRadius());
			circle circulo2 = new circle(3.0,"azul");
			System.out.println("El circulo tiene area: "+circulo2.getArea()+" y es de radio: "+circulo2.getRadius());
			System.out.println("el circulo 2 es de color: "+circulo2.getColor());
			
			// ejercicio 1.4
			//System.out.println(circulo.radius); no se puede mostrar por pantalla este valor debido a que radius es una variable privada
			//									  si esto pasara se estarian violando los principios de la encapsulacion
			circulo2.setColor("verde");
			circulo2.setRadius(8.0);
			System.out.println("El circulo tiene area: "+circulo2.getArea()+", es de radio: "+circulo2.getRadius()+" y es de color: "+circulo2.getColor());
			System.out.println(circulo2.toString());
			System.out.println(circulo2); //llamada implicita
			System.out.println("otra llamada implicita -> "+circulo2);
			
	}

}
