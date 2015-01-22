public class Dormitorio extends Ambiente {
	private boolean placard;
	public Dormitorio(){
		placard=false;
	}
	public Dormitorio(boolean placard){
		this.placard=placard;
	}
	public void setPlacard(boolean placard){this.placard=placard;}
	public boolean getPlacard(){return placard;}
	@Override
	public String toString(){
		return "\n -Dormitorio \n -->Ventanas:"+super.getVentana()
				+"\n -->Puertas:"+super.getPuerta()
				+"\n -->placard:"+placard;
	}
}
