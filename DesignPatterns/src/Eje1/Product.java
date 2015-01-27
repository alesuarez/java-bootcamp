package Eje1;

public abstract class Product {
	private double price;
	private int id;
	public Product(double price, int id) {
		this.price = price;
		this.id = id;
	}
	public abstract String toString();
	public ProductIterator iterator(){
		return new ProductIterator()
	}
	
}
