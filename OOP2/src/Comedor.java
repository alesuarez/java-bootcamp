public class Comedor extends Ambiente{
	private int capacidad;
	public Comedor(){
		capacidad=1;
	}
	public Comedor(int capacidad){
		this.capacidad=capacidad;
	}
	public void setCapacidad(int capacidad){this.capacidad=capacidad;}
	public int getCapacidad(){return capacidad;}
	@Override
	public String toString(){
		return "\n -Comedor \n -->Ventanas:"+super.getVentana()
				+"\n -->Puertas:"+super.getPuerta()
				+"\n -->Capacidad:"+capacidad;				
	}
	
}
