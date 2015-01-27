package Eje1;

public class User {
	private int idUser;
	private String nombre;
	private String direccion;
	
	public User(int idUser, String nombre, String direccion) {
		this.idUser = idUser;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}

