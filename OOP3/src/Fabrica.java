public class Fabrica {
	protected String tipo;
	
	public Fabrica(String tipo){
		this.tipo=tipo;
	}
	public Edificio crearEdificio(){
		if (tipo.equalsIgnoreCase("Hospital")){
			return new Hospital();
		}
		
		else if (tipo.equalsIgnoreCase("Escuela")){
			return new Escuela();
		}
		else if (tipo.equalsIgnoreCase("Negocio")){
			return new Negocio();
		}
		else{
			return new Casa();
		}
	}
}
