
public abstract class Ambiente {
	private int ventana;
	private int puerta;
	private double superficie;
	public Ambiente(){
		ventana=0;
		puerta=1;
		superficie=0;
	}
	public Ambiente(int ventana,int puerta,double superficie){
		this.ventana=ventana;
		this.puerta=puerta;
		this.superficie=superficie;
	}
	public Ambiente(double superficie){
		this(0,1,superficie);
	}
	public int getPuerta(){return puerta;}
	public void setPuerta(int puerta){this.puerta=puerta;}
	public int getVentana(){return ventana;}
	public void setVentana(int ventana){this.ventana=ventana;}
	public double setSuperficie(){return superficie;}
	public void getSuperficie(double superficie){this.superficie=superficie;}
	public abstract String toString();
	
}
