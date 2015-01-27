package Eje1;

public class SingletonShoppingCart {
	private static final SingletonShoppingCart shoppingCart = new SingletonShoppingCart();
	private int id;
	private static int idSiguiente=1;
	private SingletonShoppingCart(){
		id=idSiguiente;
		idSiguiente++;
	}
	public static SingletonShoppingCart getShoppingCart(){
		return shoppingCart;
	}
	
}
