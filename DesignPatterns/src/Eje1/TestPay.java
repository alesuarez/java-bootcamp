package Eje1;

import java.util.Scanner;

public class TestPay {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		PayFactory miFabrica;
		Pay pago;
		
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
