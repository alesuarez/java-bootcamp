
public class Cocina extends Ambiente {
	private int alacena;
	private boolean cocina;
	public Cocina(){
		alacena=0;
		cocina=true;
	}
	public Cocina(int alacena,boolean cocina){
		this.alacena=alacena;
		this.cocina=cocina;
	}
	public void setAlacena(int alacena){this.alacena=alacena;}
	public int getAlacena(){return alacena;}
	public void setCocina(boolean cocina){this.cocina=cocina;}
	public boolean getCocina(){return cocina;}
	@Override
	public String toString(){
		return "\n -Cocina \n -->Ventanas:"+super.getVentana()
				+"\n -->Puertas:"+super.getPuerta()
				+"\n -->Alacena:"+alacena
				+"\n -->Cocina:"+cocina;
	}
}
