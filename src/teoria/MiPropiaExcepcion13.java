package teoria;
class MiExcepcion extends Exception {

}

public class MiPropiaExcepcion13 {
	int divisor = 0;

	public void viendoFallo() throws MiExcepcion {
		if (divisor == 0)
			//Tirando mi propia excepcion necesito de throws
			throw new MiExcepcion();
	}

	public static void main(String[] args) {
		MiPropiaExcepcion13 nuevo = new MiPropiaExcepcion13();
		try {
			nuevo.viendoFallo();
			
		} catch (MiExcepcion e) {
			System.err.print("Divisor sigue siendo cero");
//			println("divisior sigue siendo cero");
		}
	}

}
