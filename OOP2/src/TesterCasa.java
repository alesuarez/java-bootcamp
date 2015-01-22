
public class TesterCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ambiente dormitorio1 = new Dormitorio();
		Ambiente bano1 = new Bano(true,false,true);
		Ambiente cocina1 = new Cocina();
		Ambiente comedor1 = new Comedor(10);
		Ambiente[] ambiente1={dormitorio1,bano1,cocina1,comedor1};
		Casa casaPepe=new Casa(ambiente1);
		casaPepe.Mostrar();
	}

}
