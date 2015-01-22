

public class Book {

	private String 	name;
	private Author 	author;
	private double 	price;
	private int 	qtyInStock;

	public Book(String name,Author author,double price){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=0;
	}
	public Book(String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
//GETTERS
	public String getName()			{return name;}
	public Author getAuthor()		{return author;}
	public double getPrice()		{return price;}
	public int getQtyInStock()		{return qtyInStock;}
	public String getAuthorName()	{return author.getName();}
	public String getAuthorEmail()	{return author.getEmail();}
	public char getAuthorGender()	{return author.getGender();}

//SETTERS
	public void setPrice(double price)			{this.price=price;}
	public void setQtyInStock(int qtyInStock)	{this.qtyInStock=qtyInStock;}
	
//METHODS
	public String toString(){
		return "'"+name+"' by "+author.getName()+" ("+author.getGender()+") at "+author.getEmail();
	}
}
