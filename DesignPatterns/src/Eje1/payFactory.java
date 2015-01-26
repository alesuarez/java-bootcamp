package Eje1;

public class payFactory {
	protected String type;
	public payFactory(String type){this.type=type;}
	public Pay createPay(){
		if (type.equalsIgnoreCase("Credit card")){
			return new CreditCard();
		}
		else if (type.equalsIgnoreCase("paypal")){
			return new Paypal();
		}
		else{
			return new Cash();
		}
	}
}
