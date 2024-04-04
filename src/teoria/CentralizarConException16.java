package teoria;
class MiExcepcionFinal extends Exception {
	//Esta clase no hereda de excepcion pero puede controlarlas 
	//basandose en los tipos. Esto permite que en el resto del 
	//codigo solo se use Exception
	int Tipo=0;
	MiExcepcionFinal(String mensaje) {
		// TODO Auto-generated constructor stub
		if(mensaje.equals("divisor"))
			Tipo=1;
	}
	int tramientoExcepcion(){
		if(Tipo==1){
			System.out.println("fallo por divisor a cero. Arreglando");
			return 1;
		}	
		else return 2;
	}
}

public class CentralizarConException16 {
	int divisor = 0;

	public void viendoFallo() throws MiExcepcionFinal {
		if (divisor == 0)
			//Tirando mi propia excepcion necesito de throws
			throw new MiExcepcionFinal("divisor");
	}

	public static void main(String[] args) {
		CentralizarConException16 nuevo = new CentralizarConException16();
		boolean fallo=false;
		do{
			try {
				nuevo.viendoFallo();			
			} catch (MiExcepcionFinal e) {
				fallo=true;
				nuevo.divisor=e.tramientoExcepcion();
				fallo=false;
			}
		}while(fallo);
		System.out.println("El valor del divisor es:"+nuevo.divisor);
	}
}