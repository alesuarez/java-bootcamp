
public class Bano extends Ambiente{
	private boolean ducha;
	private boolean inodoro;
	private boolean lavatorio;
	
	public Bano(boolean ducha,boolean inodoro,boolean lavatorio){
		this.ducha=ducha;
		this.inodoro=inodoro;
		this.lavatorio=lavatorio;
	}
	public void setDucha(boolean ducha){this.ducha=ducha;}
	public boolean getDucha(){return ducha;}
	public void setInodoro(boolean inodoro){this.inodoro=inodoro;}
	public boolean getInodoro(){return inodoro;}
	public void setLavatorio(boolean lavatorio){this.lavatorio=lavatorio;}
	public boolean getLavatorio(){return lavatorio;}
	@Override
	public String toString(){
		return "\n -Baño \n -->Ventanas:"+super.getVentana()
				+"\n -->Puertas:"+super.getPuerta()
				+"\n -->Ducha:"+ducha
				+"\n -->Inododro:"+inodoro
				+"\n -->lavatorio:"+lavatorio;		
	}
	

}
