package Eje1;

public class Order implements ProductIterator {
	public int idOrder;
	public Pay total;
	private Product product[];
	private int position;
	public Order(Product product[]){
		this.product=product;
		this.position=0;
	}
	@Override
	public Object next(){
		return product[position++];
	}
	@Override
	public boolean following(){
		if(position < product.length){
			return true;
		}else{
			return false;
		}
	}
	
}
