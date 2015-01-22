import java.util.Scanner;


public class TestFabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner1= new Scanner(System.in);
		
		Fabrica fabrica1;
		Edificio edificio1;
		System.out.println("Menu de creacion (por defecto es una casa)"
							+"\n -Hospital"
							+"\n -Escuela"
							+"\n -Negocio");
		String tipo=escaner1.nextLine();
		escaner1.close();
		fabrica1=new Fabrica(tipo);
		edificio1 = fabrica1.crearEdificio();
		System.out.println(edificio1.info());
		System.out.println("hola");
	}

}
