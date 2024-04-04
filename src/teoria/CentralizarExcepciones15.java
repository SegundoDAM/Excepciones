package teoria;
class MiExcepcionCentral {
	//Esta clase no hereda de excepcion pero puede controlarlas 
	//basandose en los tipos. Esto permite que en el resto del 
	//codigo solo se use Exception
	MiExcepcionCentral(Exception e) {
		// TODO Auto-generated constructor stub
		if(e.getClass().equals(ArithmeticException.class))
			System.out.println("aritmetica");			
	}
}

public class CentralizarExcepciones15 {
	int divisor = 0;

	public void viendoFallo() throws MiExcepcion {
		if (divisor == 0)
			//Tirando mi propia excepcion necesito de throws
			throw new ArithmeticException();
	}

	public static void main(String[] args) {
		CentralizarExcepciones15 nuevo = new CentralizarExcepciones15();
		try {
			nuevo.viendoFallo();
			
		} catch (Exception e) {
			new MiExcepcionCentral(e);			
		}
	}

}