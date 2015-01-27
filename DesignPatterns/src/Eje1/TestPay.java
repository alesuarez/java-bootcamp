package Eje1;

import java.util.Scanner;

public class TestPay {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		PayFactory miFabrica;
		Pay pago;
		
		Product cd1 = new cd(23.56,1);
		Product cd2 = new cd(56.2,2);
		Product dvd1 = new dvd(45.6,3);
		Product dvd2 = new dvd(43.4,4);
		Product[] listaProductos = new Product[4];
		listaProductos[0]=cd1;
		listaProductos[1]=cd2;
		listaProductos[2]=dvd1;
		listaProductos[3]=dvd2;
		Order orden1 = new Order(listaProductos);
		
		ProductoIterator iteradorProductos1 = orden1.ite
		
		System.out.println("Elija la forma de pago:"
							+"\n -Paypal"
							+"\n -Credit Card"
							+"\n por defecto es en efectivo");
		String tipo=sc.nextLine();
		sc.close();
		miFabrica = new PayFactory(tipo);
		pago = miFabrica.createPay();
		
		System.out.println(
				pago.toString());
	}
}
