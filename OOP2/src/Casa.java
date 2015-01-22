public class Casa {
	private Ambiente[] ambiente;
	
	public Casa(Ambiente[] ambiente){
		this.ambiente=ambiente;
		
	}
	public void Mostrar(){
		for (Ambiente i:ambiente){
			System.out.print(i.toString());
		}
	}
}
