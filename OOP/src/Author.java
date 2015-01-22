

public class Author {
private String name;
private String email;
private char gender;

public Author(String name,String email,char gender){
	this.name=name;
	this.email=email;
	this.gender=gender;
}

// getters

public String getName()		{return name;}
public String getEmail()	{return email;}
public char   getGender()	{return gender;}
public String toString()	{return name+" ("+gender+") at "+email;}

// seters

public void setName(String name){
	this.name=name;
}
public void setEmail(String email){
	this.email=email;
}

}
